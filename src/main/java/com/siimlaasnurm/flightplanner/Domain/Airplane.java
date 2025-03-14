package com.siimlaasnurm.flightplanner.Domain;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @ManyToOne
    private AirplaneType airplaneType;

    @OneToMany
    private Collection<Flight> flights;
    @OneToMany
    private Collection<AirplaneZone> zones;

}
