package ru.top.prom.service.api;

import ru.top.prom.model.WeightAuto;

import java.util.ArrayList;
import java.util.List;

public class SearchResult {

    private List<WeightAuto> weightAutos = new ArrayList<>();

    private Integer totalResult;

    private Integer itemPerPage;

    private Integer position;

    private Float totalGross;

    private Float totalNetto;

    private Float totalTare;

    public List<WeightAuto> getWeightAutos() {
        return weightAutos;
    }

    public Integer getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(Integer totalResult) {
        this.totalResult = totalResult;
    }

    public Integer getItemPerPage() {
        return itemPerPage;
    }

    public void setItemPerPage(Integer itemPerPage) {
        this.itemPerPage = itemPerPage;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Float getTotalGross() {
        return totalGross;
    }

    public void setTotalGross(Float totalGross) {
        this.totalGross = totalGross;
    }

    public Float getTotalNetto() {
        return totalNetto;
    }

    public void setTotalNetto(Float totalNetto) {
        this.totalNetto = totalNetto;
    }

    public Float getTotalTare() {
        return totalTare;
    }

    public void setTotalTare(Float totalTare) {
        this.totalTare = totalTare;
    }
}
