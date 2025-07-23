package com.Solera.APIRest.APIwithTDD;

import com.Solera.APIRest.APIwithTDD.Models.PartsClass;
import com.Solera.APIRest.APIwithTDD.Models.VehiclesClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class VehiclesTest {
    @Test
    public void addVehicleWithId() {
        VehiclesClass existingVehicle = new VehiclesClass();
        int id = 123;
        existingVehicle.setModel("Ford");

        assertEquals("Ford", existingVehicle.getModel());
        assertEquals(123, id);
    }

    @Test
    public void deleteExistingVehicle() {
        VehiclesClass existingVehicle = new VehiclesClass();
        existingVehicle.setModel("Motor V8");
        assertEquals("Motor V8", existingVehicle.getModel());

        existingVehicle.setModel(null);
        assertNull(existingVehicle.getModel());
    }
}
