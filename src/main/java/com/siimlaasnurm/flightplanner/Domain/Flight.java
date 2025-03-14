package com.siimlaasnurm.flightplanner.Domain;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Timestamp departureTime;
    private Timestamp arrivalTime;

    private String flightNumber;
    private String gateNumber;

    @ManyToOne
    private Airport departureAirport;
    @ManyToOne
    private Airport arrivalAirport;

    @ManyToOne
    private Airplane airplane;

    @OneToMany
    private Collection<FlightPriceZone> priceZones;
    @OneToMany
    private Collection<Ticket> tickets;

}
