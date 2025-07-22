package com.Solera.APIRest.APIwithTDD.Controllers;

import com.Solera.APIRest.APIwithTDD.Contracts.IServiceVehicles;
import com.Solera.APIRest.APIwithTDD.Models.VehiclesClass;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/API/Vehicles")
public class VehiclesController {

    private final IServiceVehicles serviceVehicles;

    public VehiclesController(IServiceVehicles serviceVehicles) {
        this.serviceVehicles = serviceVehicles;
    }

    @GetMapping
    public ResponseEntity<List<VehiclesClass>> getAllVehicles() {
        List<VehiclesClass> vehicles = serviceVehicles.getAllVehicles();
        return ResponseEntity.ok(vehicles);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VehiclesClass> getVehicleById(@PathVariable int id) {
        VehiclesClass vehicle = serviceVehicles.getVehicleById(id);
        if (vehicle != null) {
            return ResponseEntity.ok(vehicle);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<VehiclesClass> createVehicle(@RequestBody VehiclesClass vehicle) {
        VehiclesClass createdVehicle = serviceVehicles.createVehicle(vehicle);
        return ResponseEntity.ok(createdVehicle);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteVehicle(@PathVariable int id) {
        boolean isDeleted = serviceVehicles.deleteVehicle(id);
        if (isDeleted) {
            return ResponseEntity.ok("Vehicle with ID " + id + " has been deleted successfully!");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
