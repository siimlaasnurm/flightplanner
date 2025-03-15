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

    public Number getPrice() {
        return price;
    }

    public void setPrice(Number price) {
        this.price = price;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public AirplaneZone getAirplaneZone() {
        return airplaneZone;
    }

    public void setAirplaneZone(AirplaneZone zone) {
        this.airplaneZone = zone;
    }

}
