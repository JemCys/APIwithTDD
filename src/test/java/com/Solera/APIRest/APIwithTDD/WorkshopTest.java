package com.Solera.APIRest.APIwithTDD;

import com.Solera.APIRest.APIwithTDD.Models.PartsClass;
import com.Solera.APIRest.APIwithTDD.Models.VehiclesClass;
import com.Solera.APIRest.APIwithTDD.Models.WorkshopClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class WorkshopTest {

    @Test
    public void addWorkShopWithId() {
        WorkshopClass existingWorkShop = new WorkshopClass();
        int id = 123;
        existingWorkShop.setName("Servicios Solera");

        assertEquals("Servicios Solera", existingWorkShop.getname());
        assertEquals(123, id);
    }

    @Test
    public void deleteExistingWorkShop() {
        WorkshopClass existingWorkShop = new WorkshopClass();
        existingWorkShop.setName("Servicios Solera");
        assertEquals("Motor V8", existingWorkShop.getname());

        existingWorkShop.setName(null);
        assertNull(existingWorkShop.getname());
    }
}