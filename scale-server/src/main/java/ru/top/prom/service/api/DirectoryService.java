package ru.top.prom.service.api;

import ru.top.prom.model.*;

import java.util.List;


public interface DirectoryService {

    List<WeightAuto> findAllWeightAuto();

    List<Cars> getCars();

    List<Cars> findCars(String carNum);

    List<Cargos> getCargos();

    List<Loadings> getLoadings();

    List<Unloadings> getUnloadings();

    List<CargoCarriers> getCargoCarriers();

    List<Addressees> getAddressees();

    List<Senders> getSenders();

    List<Timeframes> getTimeFrames();
}
