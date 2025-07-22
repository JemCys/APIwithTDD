package com.Solera.APIRest.APIwithTDD.Controllers;

import com.Solera.APIRest.APIwithTDD.Contracts.IServiceWorkshop;
import com.Solera.APIRest.APIwithTDD.Models.WorkshopClass;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/API/Workshops")
public class WorkshopController {

    private final IServiceWorkshop serviceWorkshop;

    public WorkshopController(IServiceWorkshop serviceWorkshop) {
        this.serviceWorkshop = serviceWorkshop;
    }

    @GetMapping
    public ResponseEntity<List<WorkshopClass>> getAllWorkshops() {
        List<WorkshopClass> workshops = serviceWorkshop.getAllWorkshops();
        return ResponseEntity.ok(workshops);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkshopClass> getWorkshopById(@PathVariable int id) {
        WorkshopClass workshop = serviceWorkshop.getWorkshopById(id);
        if (workshop != null) {
            return ResponseEntity.ok(workshop);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<WorkshopClass> createWorkshop(@RequestBody WorkshopClass workshop) {
        WorkshopClass createdWorkshop = serviceWorkshop.createWorkshop(workshop);
        return ResponseEntity.ok(createdWorkshop);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteWorkshop(@PathVariable int id) {
        boolean isDeleted = serviceWorkshop.deleteWorkshop(id);
        if (isDeleted) {
            return ResponseEntity.ok("Workshop with ID " + id + " has been deleted successfully!");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
