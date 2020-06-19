package ru.top.prom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.top.prom.model.CargoCarriers;

import java.util.List;

/**
 * Created by Владимир on 18.07.2016.
 * <p/>
 * Репозиторий для грузоперевозчика
 */
@Repository
public interface CargoCarriersRepository extends JpaRepository<CargoCarriers, Integer> {
}
