package com.siimlaasnurm.flightplanner.Repository;

import com.siimlaasnurm.flightplanner.Domain.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}
