package ru.top.prom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.top.prom.model.Unloadings;

/**
 * Created by Владимир on 18.07.2016.
 * <p/>
 * Репозиторий место разгрузки
 */
@Repository
public interface UnloadingRepository extends JpaRepository<Unloadings, Integer> {
}
