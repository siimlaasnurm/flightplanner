package com.siimlaasnurm.flightplanner.Repository;

import com.siimlaasnurm.flightplanner.Domain.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, Integer> {
}
