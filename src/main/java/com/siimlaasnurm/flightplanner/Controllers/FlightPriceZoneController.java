package com.siimlaasnurm.flightplanner.Controllers;

import com.siimlaasnurm.flightplanner.Domain.FlightPriceZone;
import com.siimlaasnurm.flightplanner.Repository.FlightPriceZoneRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flight_price_zones")
public class FlightPriceZoneController {

    private final FlightPriceZoneRepository flightPriceZoneRepository;

    public FlightPriceZoneController(FlightPriceZoneRepository repository) {
        this.flightPriceZoneRepository = repository;
    }

    @GetMapping
    public List<FlightPriceZone> getAllFlightPriceZones() {
        return flightPriceZoneRepository.findAll();
    }

}
