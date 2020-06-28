package ru.top.prom.service.api;

import ru.top.prom.model.WeightAuto;

import java.math.BigDecimal;
import java.util.*;

public class SearchResult {

    private final List<WeightAuto> weightAutos = new ArrayList<>();

    private Long totalResult;

    private Integer itemPerPage;

    private Integer position;

    private BigDecimal totalGross;

    private BigDecimal totalNetto;

    private BigDecimal totalTare;

    public List<WeightAuto> getWeightAutos() {
        return weightAutos;
    }

    public Long getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(Long totalResult) {
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

    public BigDecimal getTotalGross() {
        return totalGross;
    }

    public void setTotalGross(BigDecimal totalGross) {
        this.totalGross = totalGross;
    }

    public BigDecimal getTotalNetto() {
        return totalNetto;
    }

    public void setTotalNetto(BigDecimal totalNetto) {
        this.totalNetto = totalNetto;
    }

    public BigDecimal getTotalTare() {
        return totalTare;
    }

    public void setTotalTare(BigDecimal totalTare) {
        this.totalTare = totalTare;
    }
}
