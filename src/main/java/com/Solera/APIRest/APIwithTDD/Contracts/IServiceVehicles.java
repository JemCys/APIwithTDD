package com.Solera.APIRest.APIwithTDD.Contracts;

import com.Solera.APIRest.APIwithTDD.Models.VehiclesClass;

import java.util.List;

public interface IServiceVehicles {
    List<VehiclesClass> getAllVehicles();
    VehiclesClass getVehicleById(int id);
    VehiclesClass createVehicle(VehiclesClass vehicle);
    boolean deleteVehicle(int id);
}
