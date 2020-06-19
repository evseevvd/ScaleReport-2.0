package ru.top.prom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.top.prom.model.WeightAuto;

public interface WeightRepository extends JpaRepository<WeightAuto, Integer>, WeightSearchRepository {
}
