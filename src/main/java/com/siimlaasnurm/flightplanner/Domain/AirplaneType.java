package com.siimlaasnurm.flightplanner.Domain;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class AirplaneType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String manufacturer;
    private String model;

    @OneToMany
    private Collection<Airplane> airplanes;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
