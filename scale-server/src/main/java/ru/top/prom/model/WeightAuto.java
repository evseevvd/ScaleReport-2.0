package ru.top.prom.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Владимир on 25.06.2016.
 */
@Entity
@Table(name = "weight_auto", schema = "dbo")
public class WeightAuto extends BaseEntity {

    @Id
    @Column(name = "weight_auto_id")
    private Integer id;

    @Column(name = "weight_auto_car_nom")
    @Basic(fetch = FetchType.LAZY)
    private String carNom;

    @Column(name = "weight_auto_in_warehouse")
    @Basic(fetch = FetchType.LAZY)
    private Integer inWarehouse;

    @Column(name = "weight_auto_date_tare")
    @Temporal(TemporalType.TIMESTAMP)
    @Basic(fetch = FetchType.LAZY)
    private Date dateTare;

    @Column(name = "weight_auto_tare")
    @Basic(fetch = FetchType.LAZY)
    private Float tare;

    @Column(name = "weight_auto_date_gross")
    @Temporal(TemporalType.TIMESTAMP)
    @Basic(fetch = FetchType.LAZY)
    private Date dateGross;

    @Column(name = "weight_auto_gross")
    @Basic(fetch = FetchType.LAZY)
    private Float gross;

    @Column(name = "weight_auto_netto")
    @Basic(fetch = FetchType.LAZY)
    private Float netto;

    @Column(name = "weight_auto_tare_jpg_1")
    @Basic(fetch = FetchType.LAZY)
    private String tareJpg1;

    @Column(name = "weight_auto_tare_jpg_2")
    @Basic(fetch = FetchType.LAZY)
    private String tareJpg2;

    @Column(name = "weight_auto_tare_jpg_3")
    @Basic(fetch = FetchType.LAZY)
    private String tareJpg3;

    @Column(name = "weight_auto_tare_jpg_4")
    @Basic(fetch = FetchType.LAZY)
    private String tareJpg4;

    @Column(name = "weight_auto_gross_jpg_1")
    @Basic(fetch = FetchType.LAZY)
    private String grossJpg1;

    @Column(name = "weight_auto_gross_jpg_2")
    @Basic(fetch = FetchType.LAZY)
    private String grossJpg2;

    @Column(name = "weight_auto_gross_jpg_3")
    @Basic(fetch = FetchType.LAZY)
    private String grossJpg3;

    @Column(name = "weight_auto_gross_jpg_4")
    @Basic(fetch = FetchType.LAZY)
    private String grossJpg4;

    @Column(name = "weight_auto_cargo_carrier")
    @Basic(fetch = FetchType.LAZY)
    private String cargoCarrier;

    @Column(name = "weight_auto_loading")
    @Basic(fetch = FetchType.LAZY)
    private String loading;

    @Column(name = "weight_auto_unloading")
    @Basic(fetch = FetchType.LAZY)
    private String unloading;

    @Column(name = "weight_auto_cargo")
    @Basic(fetch = FetchType.LAZY)
    private String cargo;

    @Column(name = "weight_auto_addressee")
    @Basic(fetch = FetchType.LAZY)
    private String addressee;

    @Column(name = "weight_auto_sender")
    @Basic(fetch = FetchType.LAZY)
    private String sender;

    @Column(name = "weight_auto_driver")
    @Basic(fetch = FetchType.LAZY)
    private String driver;

    @Column(name = "weight_auto_car_type")
    @Basic(fetch = FetchType.LAZY)
    private String carType;

    @Column(name = "weight_auto_route")
    @Basic(fetch = FetchType.LAZY)
    private Integer route;

    @Column(name = "weight_auto_bort_nom")
    @Basic(fetch = FetchType.LAZY)
    private String bortNom;

    @Column(name = "weight_auto_birka")
    @Basic(fetch = FetchType.LAZY)
    private String birka;

    @Column(name = "weight_auto_timeframe")
    @Basic(fetch = FetchType.LAZY)
    private String timeFrame;

    @Column(name = "weight_auto_date")
    @Basic(fetch = FetchType.LAZY)
//    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "weight_auto_payer")
    @Basic(fetch = FetchType.LAZY)
    private String payer;

    @Column(name = "weight_auto_tare_detect")
    @Basic(fetch = FetchType.LAZY)
    private String tareDetect;

    @Column(name = "weight_auto_gross_detect")
    @Basic(fetch = FetchType.LAZY)
    private String  grossDetect;

    @Column(name = "weight_auto_gross_stage1")
    @Basic(fetch = FetchType.LAZY)
    private Integer grossStage1;

    @Column(name = "weight_auto_tare_stage1")
    @Basic(fetch = FetchType.LAZY)
    private Integer tareStage1;

    @Column(name = "weight_auto_incr")
    @Basic(fetch = FetchType.LAZY)
    private Integer incr;

    @Column(name = "weight_auto_dump_jpg_1")
    @Basic(fetch = FetchType.LAZY)
    private String dumpJpg1;

    @Column(name = "weight_auto_dump_jpg_2")
    @Basic(fetch = FetchType.LAZY)
    private String dumpJpg2;

    @Column(name = "weight_auto_zolnost")
    @Basic(fetch = FetchType.LAZY)
    private String zolnost;

    @Column(name = "weight_auto_plast")
    @Basic(fetch = FetchType.LAZY)
    private String plast;

    @Column(name = "weight_auto_id_id")
    @Basic(fetch = FetchType.LAZY)
    private Integer idID;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarNom() {
        return carNom;
    }

    public void setCarNom(String carNom) {
        this.carNom = carNom;
    }

    public Integer getInWarehouse() {
        return inWarehouse;
    }

    public void setInWarehouse(Integer inWarehouse) {
        this.inWarehouse = inWarehouse;
    }

    public Date getDateTare() {
        return dateTare;
    }

    public void setDateTare(Date dateTare) {
        this.dateTare = dateTare;
    }

    public Float getTare() {
        return tare;
    }

    public void setTare(Float tare) {
        this.tare = tare;
    }

    public Date getDateGross() {
        return dateGross;
    }

    public void setDateGross(Date dateFross) {
        this.dateGross = dateFross;
    }

    public Float getGross() {
        return gross;
    }

    public void setGross(Float gross) {
        this.gross = gross;
    }

    public Float getNetto() {
        return netto;
    }

    public void setNetto(Float netto) {
        this.netto = netto;
    }

    public String getTareJpg1() {
        return tareJpg1;
    }

    public void setTareJpg1(String tareJpg1) {
        this.tareJpg1 = tareJpg1;
    }

    public String getTareJpg2() {
        return tareJpg2;
    }

    public void setTareJpg2(String tareJpg2) {
        this.tareJpg2 = tareJpg2;
    }

    public String getTareJpg3() {
        return tareJpg3;
    }

    public void setTareJpg3(String tareJpg3) {
        this.tareJpg3 = tareJpg3;
    }

    public String getTareJpg4() {
        return tareJpg4;
    }

    public void setTareJpg4(String tareJpg4) {
        this.tareJpg4 = tareJpg4;
    }

    public String getGrossJpg1() {
        return grossJpg1;
    }

    public void setGrossJpg1(String grossJpg1) {
        this.grossJpg1 = grossJpg1;
    }

    public String getGrossJpg2() {
        return grossJpg2;
    }

    public void setGrossJpg2(String grossJpg2) {
        this.grossJpg2 = grossJpg2;
    }

    public String getGrossJpg3() {
        return grossJpg3;
    }

    public void setGrossJpg3(String grossJpg3) {
        this.grossJpg3 = grossJpg3;
    }

    public String getGrossJpg4() {
        return grossJpg4;
    }

    public void setGrossJpg4(String grossJpg4) {
        this.grossJpg4 = grossJpg4;
    }

    public String getCargoCarrier() {
        return cargoCarrier;
    }

    public void setCargoCarrier(String cargoCarrier) {
        this.cargoCarrier = cargoCarrier;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Integer getRoute() {
        return route;
    }

    public void setRoute(Integer route) {
        this.route = route;
    }

    public String getBortNom() {
        return bortNom;
    }

    public void setBortNom(String bortNom) {
        this.bortNom = bortNom;
    }

    public String getBirka() {
        return birka;
    }

    public void setBirka(String birka) {
        this.birka = birka;
    }

    public String getTimeFrame() {
        return timeFrame;
    }

    public void setTimeFrame(String timeFrame) {
        this.timeFrame = timeFrame;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getTareDetect() {
        return tareDetect;
    }

    public void setTareDetect(String tareDetect) {
        this.tareDetect = tareDetect;
    }

    public String getGrossDetect() {
        return grossDetect;
    }

    public void setGrossDetect(String grossDetect) {
        this.grossDetect = grossDetect;
    }

    public Integer getGrossStage1() {
        return grossStage1;
    }

    public void setGrossStage1(Integer grossStage1) {
        this.grossStage1 = grossStage1;
    }

    public Integer getTareStage1() {
        return tareStage1;
    }

    public void setTareStage1(Integer tareStage1) {
        this.tareStage1 = tareStage1;
    }

    public Integer getIncr() {
        return incr;
    }

    public void setIncr(Integer incr) {
        this.incr = incr;
    }

    public String getDumpJpg1() {
        return dumpJpg1;
    }

    public void setDumpJpg1(String dumpJpg1) {
        this.dumpJpg1 = dumpJpg1;
    }

    public String getDumpJpg2() {
        return dumpJpg2;
    }

    public void setDumpJpg2(String dumpJpg2) {
        this.dumpJpg2 = dumpJpg2;
    }

    public String getZolnost() {
        return zolnost;
    }

    public void setZolnost(String zolnost) {
        this.zolnost = zolnost;
    }

    public String getPlast() {
        return plast;
    }

    public void setPlast(String plast) {
        this.plast = plast;
    }

    public Integer getIdID() {
        return idID;
    }

    public void setIdID(Integer idID) {
        this.idID = idID;
    }
}

