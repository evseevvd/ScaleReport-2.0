package ru.top.prom.model;

import javax.persistence.*;

/**
 * Created by Владимир on 18.07.2016.
 */
@Entity
@Table(name = "cargo", schema = "dbo")
public class Cargos extends BaseEntity {
    private int id;
    private String name;
    private String num;
    private Double weightMin;
    private Double weightMax;
    private String Wh;

    @Id
    @Column(name = "cargo_id")
    public int getId() {
        return id;
    }

    public void setId(int cargoId) {
        this.id = cargoId;
    }

    @Basic
    @Column(name = "cargo_name")
    public String getName() {
        return name;
    }

    public void setName(String cargoName) {
        this.name = cargoName;
    }

    @Basic
    @Column(name = "cargo_num")
    public String getNum() {
        return num;
    }

    public void setNum(String cargoNum) {
        this.num = cargoNum;
    }

    @Basic
    @Column(name = "cargo_weight_min")
    public Double getWeightMin() {
        return weightMin;
    }

    public void setWeightMin(Double cargoWeightMin) {
        this.weightMin = cargoWeightMin;
    }

    @Basic
    @Column(name = "cargo_weight_max")
    public Double getWeightMax() {
        return weightMax;
    }

    public void setWeightMax(Double cargoWeightMax) {
        this.weightMax = cargoWeightMax;
    }

    @Basic
    @Column(name = "cargo_wh")
    public String getWh() {
        return Wh;
    }

    public void setWh(String cargoWh) {
        this.Wh = cargoWh;
    }
}
