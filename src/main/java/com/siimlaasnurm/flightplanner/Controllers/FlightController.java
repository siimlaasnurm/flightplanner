package com.siimlaasnurm.flightplanner.Controllers;

import com.siimlaasnurm.flightplanner.Domain.Flight;
import com.siimlaasnurm.flightplanner.Repository.FlightRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    private final FlightRepository flightRepository;

    public FlightController(FlightRepository repository) {
        this.flightRepository = repository;
    }

    @GetMapping
    public List<Flight> getFlights() {
        return flightRepository.findAll();
    }

}
