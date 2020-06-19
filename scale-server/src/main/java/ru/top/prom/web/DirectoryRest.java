package ru.top.prom.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.top.prom.model.*;
import ru.top.prom.service.api.DirectoryService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DirectoryRest {

    private DirectoryService service;

    public DirectoryRest(DirectoryService service) {
        this.service = service;
    }

    //FIXME зачем оно???? 0_о
    @GetMapping(value = "/list")
    public List<WeightAuto> getAll() {
        return new ArrayList<>();
    }

    @GetMapping(value = "/carnom")
    public List<Cars> getAllCarNom() {
        return service.getCars();
    }

    @GetMapping(value = "/find/car/{carNum}")
    public List<Cars> findCarNom(@PathVariable String carNum) {
        return service.findCars(carNum);
    }

    @GetMapping(value = "/loading")
    public List<Loadings> getAllLoading() {
        return service.getLoadings();
    }

    @GetMapping(value = "/unloading")
    public List<Unloadings> getAllUnloading() {
        return service.getUnloadings();
    }

    @GetMapping(value = "/cargo")
    public List<Cargos> getAllCargo() {
        return service.getCargos();
    }

    @GetMapping(value = "/cargocarrier")
    public List<CargoCarriers> getAllCargoCarrier() {
        return service.getCargoCarriers();
    }

    @GetMapping(value = "/addressee")
    public List<Addressees> getAllAddressee() {
        return service.getAddressees();
    }

    @GetMapping(value = "/sender")
    public List<Senders> getAllSender() {
        return service.getSenders();
    }

    @GetMapping(value = "/smena")
    public List<Timeframes> getAllTimeFrames() {
        return service.getTimeFrames();
    }

}
