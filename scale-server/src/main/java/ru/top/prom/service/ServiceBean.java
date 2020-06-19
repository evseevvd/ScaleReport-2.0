package ru.top.prom.service;


import org.springframework.stereotype.Service;
import ru.top.prom.repository.WeightRepository;
import ru.top.prom.service.api.SRService;
import ru.top.prom.service.api.SearchCriteria;
import ru.top.prom.service.api.SearchResult;

@Service
public class ServiceBean implements SRService {

    private WeightRepository weightAutoWeightRepository;


    public ServiceBean(
            WeightRepository weightAutoWeightRepository
    ) {
        this.weightAutoWeightRepository = weightAutoWeightRepository;
    }

    @Override
    public SearchResult findWeightAuto(SearchCriteria criteria) {
        return weightAutoWeightRepository.findByCriteria(criteria);
    }

    @Override
    public SearchResult findWeightAutoAll(SearchCriteria criteria) {
        return weightAutoWeightRepository.findAllByCriteria(criteria);
    }

}
