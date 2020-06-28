package ru.top.prom.repository;

import ru.top.prom.service.api.SearchCriteria;
import ru.top.prom.service.api.SearchResult;

public interface WeightSearchRepository {

    /**
     * Поиск сущности по критерии
     * @return
     */
    SearchResult findByCriteria(SearchCriteria criteria);

    SearchResult computedTotalAmount(SearchCriteria criteria);
}
