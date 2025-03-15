package com.siimlaasnurm.flightplanner.Controllers;

import com.siimlaasnurm.flightplanner.Domain.Airport;
import com.siimlaasnurm.flightplanner.Repository.AirportRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/airports")
public class AirportController {

    private final AirportRepository airportRepository;

    public AirportController(AirportRepository repository) {
        this.airportRepository = repository;
    }

    @GetMapping
    public List<Airport> getAirports() {
        return airportRepository.findAll();
    }

}
