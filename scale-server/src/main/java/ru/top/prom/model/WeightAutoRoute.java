package ru.top.prom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Владимир on 25.06.2016.
 */
@Entity
@Table(name = "route", schema = "dbo")
public class WeightAutoRoute extends BaseEntity {

    @Id
    @Column(name = "route_id")
    private Integer id;

    @Column(name = "route_name")
    private String name;

    @Column(name = "route_time")
    private String time;

    @Column(name = "route_length")
    private String length;

    @Column(name = "route_sender")
    private String sender;

    @Column(name = "route_addressee")
    private String addressee;

    @Column(name = "route_cargo")
    private String cargo;

    @Column(name = "route_loading")
    private String loading;

    @Column(name = "route_unloading")
    private String unloading;

    @Column(name = "route_brutto_first")
    private Integer bruttoFirst;

    @Column(name = "route_payer")
    private String payer;

    @Column(name = "route_start_h")
    private String startH;

    @Column(name = "route_start_m")
    private String startM;

    @Column(name = "route_stop_h")
    private String stopH;

    @Column(name = "route_stop_m")
    private String stopM;

    @Column(name = "route_hours")
    private String hours;

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getLoading() {
        return loading;
    }

    public void setLoading(String loading) {
        this.loading = loading;
    }

    public String getUnloading() {
        return unloading;
    }

    public void setUnloading(String unloading) {
        this.unloading = unloading;
    }

    public Integer getBruttoFirst() {
        return bruttoFirst;
    }

    public void setBruttoFirst(Integer bruttoFirst) {
        this.bruttoFirst = bruttoFirst;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getStartH() {
        return startH;
    }

    public void setStartH(String startH) {
        this.startH = startH;
    }

    public String getStartM() {
        return startM;
    }

    public void setStartM(String startM) {
        this.startM = startM;
    }

    public String getStopH() {
        return stopH;
    }

    public void setStopH(String stopH) {
        this.stopH = stopH;
    }

    public String getStopM() {
        return stopM;
    }

    public void setStopM(String stopM) {
        this.stopM = stopM;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }
}
