package com.siimlaasnurm.flightplanner.Domain;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class AirplaneZone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Integer rows;
    private Integer rowSeats;

    @ManyToOne
    private Airplane airplane;

    @OneToMany
    private Collection<FlightPriceZone> flightPrices;

}
