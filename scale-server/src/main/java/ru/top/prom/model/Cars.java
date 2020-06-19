package ru.top.prom.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Владимир on 18.07.2016.
 */
@Entity
@Table(name = "car", schema = "dbo")
public class Cars extends BaseEntity{
    private int id;
    private String name;
    private String type;
    private Integer route;
    private String cargoCarrier;
    private String label;
    private Integer weightStage;
    private Double weightNetto;
    private Double weightTare;
    private String driver;
    private String bortNom;
    private Timestamp dateTare;

    @Id
    @Column(name = "car_id")
    public int getId() {
        return id;
    }

    public void setId(int carId) {
        this.id = carId;
    }

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "car_name")
    public String getName() {
        return name;
    }

    public void setName(String carName) {
        this.name = carName;
    }

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "car_car_type")
    public String getType() {
        return type;
    }

    public void setType(String carCarType) {
        this.type = carCarType;
    }

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "car_route")
    public Integer getRoute() {
        return route;
    }

    public void setRoute(Integer carRoute) {
        this.route = carRoute;
    }

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "car_cargo_carrier")
    public String getCargoCarrier() {
        return cargoCarrier;
    }

    public void setCargoCarrier(String carCargoCarrier) {
        this.cargoCarrier = carCargoCarrier;
    }

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "car_label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String carLabel) {
        this.label = carLabel;
    }

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "car_weight_stage")
    public Integer getWeightStage() {
        return weightStage;
    }

    public void setWeightStage(Integer carWeightStage) {
        this.weightStage = carWeightStage;
    }

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "car_weight_netto")
    public Double getWeightNetto() {
        return weightNetto;
    }

    public void setWeightNetto(Double carWeightNetto) {
        this.weightNetto = carWeightNetto;
    }

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "car_weight_tare")
    public Double getWeightTare() {
        return weightTare;
    }

    public void setWeightTare(Double carWeightTare) {
        this.weightTare = carWeightTare;
    }

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "car_driver")
    public String getDriver() {
        return driver;
    }

    public void setDriver(String carDriver) {
        this.driver = carDriver;
    }

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "car_bort_nom")
    public String getBortNom() {
        return bortNom;
    }

    public void setBortNom(String carBortNom) {
        this.bortNom = carBortNom;
    }

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "car_date_tare")
    public Timestamp getDateTare() {
        return dateTare;
    }

    public void setDateTare(Timestamp carDateTare) {
        this.dateTare = carDateTare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cars cars = (Cars) o;

        if (id != cars.id) return false;
        if (name != null ? !name.equals(cars.name) : cars.name != null) return false;
        if (type != null ? !type.equals(cars.type) : cars.type != null) return false;
        if (route != null ? !route.equals(cars.route) : cars.route != null) return false;
        if (cargoCarrier != null ? !cargoCarrier.equals(cars.cargoCarrier) : cars.cargoCarrier != null)
            return false;
        if (label != null ? !label.equals(cars.label) : cars.label != null) return false;
        if (weightStage != null ? !weightStage.equals(cars.weightStage) : cars.weightStage != null)
            return false;
        if (weightNetto != null ? !weightNetto.equals(cars.weightNetto) : cars.weightNetto != null)
            return false;
        if (weightTare != null ? !weightTare.equals(cars.weightTare) : cars.weightTare != null)
            return false;
        if (driver != null ? !driver.equals(cars.driver) : cars.driver != null) return false;
        if (bortNom != null ? !bortNom.equals(cars.bortNom) : cars.bortNom != null) return false;
        if (dateTare != null ? !dateTare.equals(cars.dateTare) : cars.dateTare != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (route != null ? route.hashCode() : 0);
        result = 31 * result + (cargoCarrier != null ? cargoCarrier.hashCode() : 0);
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + (weightStage != null ? weightStage.hashCode() : 0);
        result = 31 * result + (weightNetto != null ? weightNetto.hashCode() : 0);
        result = 31 * result + (weightTare != null ? weightTare.hashCode() : 0);
        result = 31 * result + (driver != null ? driver.hashCode() : 0);
        result = 31 * result + (bortNom != null ? bortNom.hashCode() : 0);
        result = 31 * result + (dateTare != null ? dateTare.hashCode() : 0);
        return result;
    }
}
