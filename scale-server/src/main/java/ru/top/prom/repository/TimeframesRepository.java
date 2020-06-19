package ru.top.prom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.top.prom.model.Timeframes;

/**
 * Created by Владимир on 18.07.2016.
 */
@Repository
public interface TimeframesRepository extends JpaRepository<Timeframes, Integer> {
}
