package com.siimlaasnurm.flightplanner.Controllers;

import com.siimlaasnurm.flightplanner.Domain.AirplaneZone;
import com.siimlaasnurm.flightplanner.Repository.AirplaneZoneRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/airplane_zones")
public class AirplaneZoneController {

    private final AirplaneZoneRepository airplaneZoneRepository;

    public AirplaneZoneController(AirplaneZoneRepository repository) {
        this.airplaneZoneRepository = repository;
    }

    public List<AirplaneZone> getAirplaneZones() {
        return airplaneZoneRepository.findAll();
    }

}
