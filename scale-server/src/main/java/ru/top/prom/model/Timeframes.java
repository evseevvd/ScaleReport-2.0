package ru.top.prom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Владимир on 18.07.2016.
 *
 * Сущность смена (1 смена, 2 смена)
 */
@Entity
@Table(name = "timeframe", schema = "dbo")
public class Timeframes extends BaseEntity{

    @Id
    @Column(name = "timeframe_id")
    private Integer id;

    @Column(name = "timeframe_name")
    private String name;

    @Column(name = "timeframe_begin_hour")
    private Integer startHour;

    @Column(name = "timeframe_begin_minute")
    private Integer startMin;

    @Column(name = "timeframe_end_hour")
    private Integer endHour;

    @Column(name = "timeframe_end_minute")
    private Integer endMin;

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

    public Integer getStartHour() {
        return startHour;
    }

    public void setStartHour(Integer startHour) {
        this.startHour = startHour;
    }

    public Integer getStartMin() {
        return startMin;
    }

    public void setStartMin(Integer startMin) {
        this.startMin = startMin;
    }

    public Integer getEndHour() {
        return endHour;
    }

    public void setEndHour(Integer endHour) {
        this.endHour = endHour;
    }

    public Integer getEndMin() {
        return endMin;
    }

    public void setEndMin(Integer endMin) {
        this.endMin = endMin;
    }
}
