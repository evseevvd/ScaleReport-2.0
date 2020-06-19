package ru.top.prom.repository.impl;

import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;
import ru.top.prom.model.WeightAuto;
import ru.top.prom.repository.WeightSearchRepository;
import ru.top.prom.service.api.SearchCriteria;
import ru.top.prom.service.api.SearchResult;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class WeightSearchRepositoryImpl implements WeightSearchRepository {

    EntityManager em;

    @Override
    public SearchResult findByCriteria(SearchCriteria criteria) {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<WeightAuto> weightAutoCriteriaQuery = criteriaBuilder.createQuery(WeightAuto.class);
        Root<WeightAuto> root = weightAutoCriteriaQuery.from(WeightAuto.class);
        List<Predicate> predicates = new ArrayList<>();

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

        weightAutoCriteriaQuery.select(root).where(predicates.toArray(new Predicate[predicates.size()])).orderBy(criteriaBuilder.asc(root.get("dateGross")));

        Query resultQuery = em.createQuery(weightAutoCriteriaQuery);

        resultQuery.setFirstResult(criteria.getPosition());
        resultQuery.setMaxResults(criteria.getItemPerPage());

        float gross = 0;
        float tare = 0;
        float netto = 0;
        for (WeightAuto weightAuto : em.createQuery(weightAutoCriteriaQuery).getResultList()) {
            if (weightAuto.getGross() != null) {
                gross += weightAuto.getGross();
            }
            if (weightAuto.getTare() != null) {
                tare += weightAuto.getTare();
            }
            if (weightAuto.getNetto() != null) {
                netto += weightAuto.getNetto();
            }
        }
        ;
        SearchResult response = new SearchResult();

        response.setItemPerPage(criteria.getItemPerPage());
        response.setTotalResult(em.createQuery(weightAutoCriteriaQuery).getResultList().size());
        response.setPosition(criteria.getPosition());
        response.getWeightAutos().addAll(resultQuery.getResultList());
        response.setTotalGross(gross);
        response.setTotalTare(tare);
        response.setTotalNetto(netto);
        return response;
    }

    @Override
    public SearchResult findAllByCriteria(SearchCriteria criteria) {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<WeightAuto> weightAutoCriteriaQuery = criteriaBuilder.createQuery(WeightAuto.class);
        Root<WeightAuto> root = weightAutoCriteriaQuery.from(WeightAuto.class);
        List<Predicate> predicates = new ArrayList<>();

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

        weightAutoCriteriaQuery.select(root).where(predicates.toArray(new Predicate[predicates.size()])).orderBy(criteriaBuilder.asc(root.get("dateGross")));

        Query resultQuery = em.createQuery(weightAutoCriteriaQuery);

        SearchResult response = new SearchResult();
        response.getWeightAutos().addAll(resultQuery.getResultList());


        return response;
    }
}
