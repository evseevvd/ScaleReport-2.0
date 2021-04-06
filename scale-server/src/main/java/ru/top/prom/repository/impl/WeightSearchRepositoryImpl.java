package ru.top.prom.repository.impl;

import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;
import ru.top.prom.model.WeightAuto;
import ru.top.prom.repository.WeightSearchRepository;
import ru.top.prom.service.api.SearchCriteria;
import ru.top.prom.service.api.SearchResult;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.math.BigDecimal.ZERO;

@Repository
public class WeightSearchRepositoryImpl implements WeightSearchRepository {

    @PersistenceContext
    EntityManager em;

    @Override
    public SearchResult findByCriteria(SearchCriteria criteria) {
        CriteriaBuilder qb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = qb.createQuery(Long.class);
        Root<WeightAuto> rootCount = cq.from(WeightAuto.class);
        cq.select(qb.count(rootCount));
        cq.where(buildPredicates(criteria, qb, rootCount).toArray(new Predicate[0]));
        Long total = em.createQuery(cq).getSingleResult();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<WeightAuto> weightAutoCriteriaQuery = cb.createQuery(WeightAuto.class);
        Root<WeightAuto> root = weightAutoCriteriaQuery.from(WeightAuto.class);
        List<Predicate> predicates = buildPredicates(criteria, cb, root);

        weightAutoCriteriaQuery
                .select(root)
                .where(predicates.toArray(new Predicate[0]))
                .orderBy(cb.asc(root.get("dateGross")));

        TypedQuery<WeightAuto> resultQuery = em.createQuery(weightAutoCriteriaQuery);

        resultQuery.setFirstResult(criteria.getPosition());
        resultQuery.setMaxResults(criteria.getItemPerPage());

        Supplier<Stream<WeightAuto>> resultStream = () -> em.createQuery(weightAutoCriteriaQuery).getResultStream();
        BigDecimal gross = computedTotal(resultStream, WeightAuto::getGross);
        BigDecimal tare = computedTotal(resultStream, WeightAuto::getTare);
        BigDecimal netto = computedTotal(resultStream, WeightAuto::getNetto);

        SearchResult response = new SearchResult();
        response.setItemPerPage(criteria.getItemPerPage());
        response.setTotalResult(total);
        response.setPosition(criteria.getPosition());
        resultQuery.getResultStream().forEach(response.getWeightAutos()::add);
        response.setTotalGross(gross);
        response.setTotalTare(tare);
        response.setTotalNetto(netto);
        return response;
    }

    @Override
    public SearchResult computedTotalAmount(SearchCriteria criteria) {
        return null;
    }

    private List<Predicate> buildPredicates(SearchCriteria criteria, CriteriaBuilder criteriaBuilder, Root<WeightAuto> root) {
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(
                criteriaBuilder.or(
                        criteriaBuilder.equal(root.get("removed"), Boolean.FALSE),
                        criteriaBuilder.isNull(root.get("removed"))
                ));
        if (!StringUtils.isEmpty(criteria.getSmena())) {
            predicates.add(criteriaBuilder.equal(root.get("timeFrame"), criteria.getSmena()));
        }
        if (criteria.getStartDate() != null && criteria.getEndDate() == null) {
            predicates.add(criteriaBuilder.equal(root.<Date>get("dateGross"), criteria.getStartDate()));
        }
        if (criteria.getStartDate() != null && criteria.getEndDate() != null) {
            predicates.add(criteriaBuilder.between(root.<Date>get("dateGross"), criteria.getStartDate(), criteria.getEndDate()));
        }
        if (!StringUtils.isEmpty(criteria.getUnloading())) {
            predicates.add(criteriaBuilder.equal(root.get("unloading"), criteria.getUnloading()));
        }
        if (!StringUtils.isEmpty(criteria.getLoading())) {
            predicates.add(criteriaBuilder.equal(root.get("loading"), criteria.getLoading()));
        }
        if (criteria.getCarNom() != null && criteria.getCarNom().size() > 0) {
            predicates.add(root.get("carNom").in(criteria.getCarNom()));
        }
        if (!StringUtils.isEmpty(criteria.getCargoCarrier())) {
            predicates.add(criteriaBuilder.equal(root.get("driver"), criteria.getCargoCarrier()));
        }
        if (!StringUtils.isEmpty(criteria.getAddressee())) {
            predicates.add(criteriaBuilder.equal(root.get("addressee"), criteria.getAddressee()));
        }
        if (!StringUtils.isEmpty(criteria.getSender())) {
            predicates.add(criteriaBuilder.equal(root.get("sender"), criteria.getSender()));
        }
        if (!StringUtils.isEmpty(criteria.getRoute())) {
            predicates.add(criteriaBuilder.equal(root.get("route"), criteria.getRoute()));
        }
        if (criteria.getCargo() != null && criteria.getCargo().size() > 0) {
            predicates.add(root.get("cargo").in(criteria.getCargo()));
        }
        return predicates;
    }

    private BigDecimal computedTotal(Supplier<Stream<WeightAuto>> stream, Function<WeightAuto, Float> mapper) {
        return stream
                .get()
                .map(mapper)
                .filter(Objects::nonNull)
                .map(BigDecimal::new)
                .reduce(BigDecimal::add)
                .orElse(ZERO)
                .setScale(2, RoundingMode.CEILING);
    }
}
