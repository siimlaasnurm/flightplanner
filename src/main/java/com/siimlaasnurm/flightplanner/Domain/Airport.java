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

    @OneToMany(mappedBy = "DepartureAirport")
    private Collection<Flight> departingFlights;
    @OneToMany(mappedBy = "ArrivalAirport")
    private Collection<Flight> arrivingFlights;

}
