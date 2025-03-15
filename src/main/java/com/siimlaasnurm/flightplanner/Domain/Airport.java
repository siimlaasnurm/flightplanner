package com.siimlaasnurm.flightplanner.Domain;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String shortName;
    private String city;

    @OneToMany(mappedBy = "departureAirport")
    private Collection<Flight> departingFlights;
    @OneToMany(mappedBy = "arrivalAirport")
    private Collection<Flight> arrivingFlights;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String name) {
        this.shortName = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
