package ru.top.prom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Владимир on 18.07.2016.
 *
 * Сущность место разгрузки
 */
@Entity
@Table(name = "unloading", schema = "dbo")
public class Unloadings extends BaseEntity{

    @Id
    @Column(name = "unloading_id")
    private Integer id;

    @Column(name = "unloading_name")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
