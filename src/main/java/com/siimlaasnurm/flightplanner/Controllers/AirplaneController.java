package com.siimlaasnurm.flightplanner.Controllers;

import com.siimlaasnurm.flightplanner.Domain.Airplane;
import com.siimlaasnurm.flightplanner.Repository.AirplaneRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/airplanes")
public class AirplaneController {

    private final AirplaneRepository airplaneRepository;

    public AirplaneController(AirplaneRepository repository) {
        this.airplaneRepository = repository;
    }

    @GetMapping
    public List<Airplane> getAirplanes() {
        return airplaneRepository.findAll();
    }

}
