package ru.top.prom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.top.prom.model.Addressees;

/**
 * Created by Владимир on 18.07.2016.
 * <p/>
 * Репозиторий для грузополучателя
 */
@Repository
public interface AddresseeRepository extends JpaRepository<Addressees, Integer> {
}
