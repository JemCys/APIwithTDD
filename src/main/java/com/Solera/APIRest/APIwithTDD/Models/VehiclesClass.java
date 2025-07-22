package com.Solera.APIRest.APIwithTDD.Models;

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
    private WorkshopClass workshop;

    @OneToMany (mappedBy = "vehicle")
    private List<PartsClass> parts;

}
