package ru.top.prom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.top.prom.model.Cars;

import java.util.List;

/**
 * Created by Владимир on 18.07.2016.
 * <p/>
 * Репозиторий грузовиков
 */
@Repository
public interface CarsRepository extends JpaRepository<Cars, Integer> {

    /**
     * Поиск грузовика
     *
     * @param name - гос номер
     * @return Вернет грузовики {@link Cars}, соответствующие гос номеру
     */
    List<Cars> findByName(String name);
}
