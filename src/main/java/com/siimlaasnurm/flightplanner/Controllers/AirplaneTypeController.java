package com.siimlaasnurm.flightplanner.Controllers;

import com.siimlaasnurm.flightplanner.Domain.AirplaneType;
import com.siimlaasnurm.flightplanner.Repository.AirplaneTypeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/airplane_types")
public class AirplaneTypeController {

    private final AirplaneTypeRepository airplaneTypeRepository;

    public AirplaneTypeController(AirplaneTypeRepository repository) {
        this.airplaneTypeRepository = repository;
    }

    @GetMapping
    public List<AirplaneType> getAirplaneTypes() {
        return airplaneTypeRepository.findAll();
    }

}
