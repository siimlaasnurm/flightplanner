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

}
