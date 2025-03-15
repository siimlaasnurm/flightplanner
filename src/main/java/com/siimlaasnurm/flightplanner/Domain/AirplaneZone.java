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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRowCount() {
        return rows;
    }

    public void setRowCount(Integer rows) {
        this.rows = rows;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

}
