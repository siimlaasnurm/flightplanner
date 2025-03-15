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

    public Timestamp getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Timestamp time) {
        this.departureTime = time;
    }

    public Timestamp getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Timestamp time) {
        this.arrivalTime = time;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport airport) {
        this.departureAirport = airport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport airport) {
        this.arrivalAirport = airport;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

}
