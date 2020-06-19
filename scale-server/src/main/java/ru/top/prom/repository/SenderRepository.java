package ru.top.prom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.top.prom.model.Senders;

/**
 * Created by Владимир on 18.07.2016.
 * <p/>
 * Репозиторий для грузоотправителя
 */
@Repository
public interface SenderRepository extends JpaRepository<Senders, Integer> {
}
