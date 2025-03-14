package com.siimlaasnurm.flightplanner.Domain;

import jakarta.persistence.*;

@Entity
public class FlightPriceZone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Number price;

    @ManyToOne
    private Flight flight;
    @ManyToOne
    private AirplaneZone airplaneZone;

}
