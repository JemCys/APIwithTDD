package com.Solera.APIRest.APIwithTDD.Models;

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
public class WorkshopClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "workshop", cascade = CascadeType.ALL)
    @JsonManagedReference //Para evitar ciclos infinitos
    private List<VehiclesClass> vehicle;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
