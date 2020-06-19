package ru.top.prom.model;

import javax.persistence.*;

/**
 * Created by Владимир on 18.07.2016.
 *
 * Сущность грузоперевозчик
 */
@Entity
@Table(name = "cargo_carrier", schema = "dbo")
public class CargoCarriers extends BaseEntity{

    private Integer id;
    private String name;
    private String fullName;
    private String address;

    @Id
    @Column(name = "cargo_carrier_id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer cargoCarrierId) {
        this.id = cargoCarrierId;
    }

    @Basic
    @Column(name = "cargo_carrier_name")
    public String getName() {
        return name;
    }

    public void setName(String cargoCarrierName) {
        this.name = cargoCarrierName;
    }

    @Basic
    @Column(name = "cargo_carrier_name_full")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String cargoCarrierNameFull) {
        this.fullName = cargoCarrierNameFull;
    }

    @Basic
    @Column(name = "cargo_carrier_address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String cargoCarrierAddress) {
        this.address = cargoCarrierAddress;
    }
}
