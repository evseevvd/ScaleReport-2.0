package ru.top.prom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.top.prom.model.Cargos;

/**
 * Created by Владимир on 18.07.2016.
 * <p/>
 * Репозиторий для вида угля
 */
@Repository
public interface CargoRepository extends JpaRepository<Cargos, Integer> {
}
