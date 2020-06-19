package ru.top.prom.service.api;

import java.util.Date;
import java.util.List;

/**
 * Created by Владимир on 25.06.2016.
 *
 * Поиск по критерии провесок
 * Критерий поиска
 * 0. Дата период или смена (1 - 08:00-19:59:59; 2 - 20:00-07:59:59)
 * 1. Вид груза (состоит из нескольких знач)
 * 2. Разгрузка
 * 3. Погрузка
 * 4. гос номер (состоит из нескольких знач)
 * 5. Грузоперевощик
 * 6. Получатель
 * 7. Отправитель
 * 8. Маршрут
 */
public class SearchCriteria {

    /**
     * Дата начала
     */
    private Date startDate;

    /**
     * Дата конца
     */
    private Date endDate;

    /**
     * Смена
     */
    private String smena;

    /**
     * Погрузка
     */
    private String loading;

    /**
     * Разгрузка
     */
    private String unloading;

    /**
     * Гос номер, возможно несколько значений
     */
    private List<String> carNom;

    /**
     * Вид груза, возможно несколько значений
     */
    private List<String> cargo;

    /**
     * Грузоперевозчик
     */
    private String cargoCarrier;

    /**
     * Получатель
     */
    private String addressee;

    /**
     * Отправитель
     */
    private String sender;

    /**
     * Маршрут
     */
    private String route;

    /**
     * Для пагинации кол-во результатов на страницу
     */
    private Integer ItemPerPage;

    /**
     * позиция в списке результатов
     */
    private Integer position;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getSmena() {
        return smena;
    }

    public void setSmena(String smena) {
        this.smena = smena;
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

    public List<String> getCarNom() {
        return carNom;
    }

    public void setCarNom(List<String> carNom) {
        this.carNom = carNom;
    }

    public String getCargoCarrier() {
        return cargoCarrier;
    }

    public void setCargoCarrier(String cargoCarrier) {
        this.cargoCarrier = cargoCarrier;
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

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public List<String> getCargo() {
        return cargo;
    }

    public void setCargo(List<String> cargo) {
        this.cargo = cargo;
    }

    public Integer getItemPerPage() {
        return ItemPerPage;
    }

    public void setItemPerPage(Integer itemPerPage) {
        ItemPerPage = itemPerPage;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
