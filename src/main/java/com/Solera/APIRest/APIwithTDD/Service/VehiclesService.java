package com.Solera.APIRest.APIwithTDD.Service;

import com.Solera.APIRest.APIwithTDD.Contracts.IServiceVehicles;
import com.Solera.APIRest.APIwithTDD.Models.VehiclesClass;
import com.Solera.APIRest.APIwithTDD.Repository.VehiclesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiclesService implements IServiceVehicles {
    private final VehiclesRepository vehiclesRepository;
    public VehiclesService (VehiclesRepository vehiclesRepository) {this.vehiclesRepository = vehiclesRepository;}


    @Override
    public List<VehiclesClass> getAllVehicles() {
        List<VehiclesClass> vehicles = (List<VehiclesClass>) vehiclesRepository.findAll();
        return vehicles;
    }

    @Override
    public VehiclesClass getVehicleById(int id) {
        if(vehiclesRepository.findById((long) id).isPresent()) {
            return vehiclesRepository.findById((long) id).get();
        }
        return null;
    }

    @Override
    public VehiclesClass createVehicle(VehiclesClass vehicle) {
        return vehiclesRepository.save(vehicle);
    }

    @Override
    public boolean deleteVehicle(int id) {
        try {
            vehiclesRepository.deleteById((long) id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}