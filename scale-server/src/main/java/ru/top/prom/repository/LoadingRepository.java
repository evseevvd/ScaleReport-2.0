package ru.top.prom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.top.prom.model.Loadings;

/**
 * Created by Владимир on 18.07.2016.
 * <p/>
 * Репозиторий место погрузки
 */
@Repository
public interface LoadingRepository extends JpaRepository<Loadings, Integer> {
}
