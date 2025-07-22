package com.Solera.APIRest.APIwithTDD.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PartsClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn (name = "vehicle_id")
    @JsonBackReference
    private VehiclesClass vehicle;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
