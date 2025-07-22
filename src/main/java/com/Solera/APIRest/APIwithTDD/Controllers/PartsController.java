package com.Solera.APIRest.APIwithTDD.Controllers;

import com.Solera.APIRest.APIwithTDD.Contracts.IServiceParts;
import com.Solera.APIRest.APIwithTDD.Models.PartsClass;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/API/Parts")
public class PartsController {

    private final IServiceParts serviceParts;

    public PartsController(IServiceParts serviceParts) {
        this.serviceParts = serviceParts;
    }

    @GetMapping
    public ResponseEntity<List<PartsClass>> getAllParts() {
        List<PartsClass> parts = serviceParts.getAllParts();
        return ResponseEntity.ok(parts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PartsClass> getPartById(@PathVariable int id) {
        PartsClass part = serviceParts.getPartById(id);
        if (part != null) {
            return ResponseEntity.ok(part);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<PartsClass> createPart(@RequestBody PartsClass part) {
        PartsClass createdPart = serviceParts.createPart(part);
        return ResponseEntity.ok(createdPart);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePart(@PathVariable int id) {
        boolean isDeleted = serviceParts.deletePart(id);
        if (isDeleted) {
            return ResponseEntity.ok("Product with ID " + id + " has been deleted successfully!");
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
