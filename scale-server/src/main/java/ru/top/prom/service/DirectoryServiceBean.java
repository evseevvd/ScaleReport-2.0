package ru.top.prom.service;

import org.springframework.stereotype.Service;
import ru.top.prom.model.*;
import ru.top.prom.repository.*;
import ru.top.prom.service.api.DirectoryService;

import java.util.List;

@Service
public class DirectoryServiceBean implements DirectoryService {

    private WeightRepository weightAutoWeightRepository;

    private AddresseeRepository addresseeRepository;

    private CargoCarriersRepository cargoCarriersRepository;

    private CargoRepository cargoRepository;

    private CarsRepository carsRepository;

    private LoadingRepository loadingRepository;

    private SenderRepository senderRepository;

    private TimeframesRepository timeframesRepository;

    private UnloadingRepository unloadingRepository;

    public DirectoryServiceBean(WeightRepository weightAutoWeightRepository,
                                AddresseeRepository addresseeRepository,
                                CargoCarriersRepository cargoCarriersRepository,
                                CargoRepository cargoRepository,
                                CarsRepository carsRepository,
                                LoadingRepository loadingRepository,
                                SenderRepository senderRepository,
                                TimeframesRepository timeframesRepository,
                                UnloadingRepository unloadingRepository) {
        this.weightAutoWeightRepository = weightAutoWeightRepository;
        this.addresseeRepository = addresseeRepository;
        this.cargoCarriersRepository = cargoCarriersRepository;
        this.cargoRepository = cargoRepository;
        this.carsRepository = carsRepository;
        this.loadingRepository = loadingRepository;
        this.senderRepository = senderRepository;
        this.timeframesRepository = timeframesRepository;
        this.unloadingRepository = unloadingRepository;
    }

    //FIXME что то не реальное, тащит всю таблицу
    @Override
    public List<WeightAuto> findAllWeightAuto() {
        return weightAutoWeightRepository.findAll();
    }

    @Override
    public List<Cars> getCars() {
        return carsRepository.findDistinctAll();
    }

    @Override
    public List<Cars> findCars(String carNum) {
        return carsRepository.findByNumber(carNum);
    }

    @Override
    public List<Cargos> getCargos() {
        return cargoRepository.findAll();
    }

    @Override
    public List<Loadings> getLoadings() {
        return loadingRepository.findAll();
    }

    @Override
    public List<Unloadings> getUnloadings() {
        return unloadingRepository.findAll();
    }

    @Override
    public List<CargoCarriers> getCargoCarriers() {
        return cargoCarriersRepository.findAll();
    }

    @Override
    public List<Addressees> getAddressees() {
        return addresseeRepository.findAll();
    }

    @Override
    public List<Senders> getSenders() {
        return senderRepository.findAll();
    }

    @Override
    public List<Timeframes> getTimeFrames() {
        return timeframesRepository.findAll();
    }
}
