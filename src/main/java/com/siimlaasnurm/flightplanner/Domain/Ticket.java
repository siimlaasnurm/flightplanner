package com.siimlaasnurm.flightplanner.Domain;

import jakarta.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstName;
    private String lastName;

    private String seatNumber;

    @ManyToOne
    private Flight flight;

}
