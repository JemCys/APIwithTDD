package com.Solera.APIRest.APIwithTDD.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VehiclesClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;
    private String brand;
    private String vehicleYear;
    private String color;
    private String vin;

    @ManyToOne
    @JoinColumn (name = "workshop_id" )
    @JsonBackReference
    private WorkshopClass workshop;

    @OneToMany (mappedBy = "vehicle", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<PartsClass> parts;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
