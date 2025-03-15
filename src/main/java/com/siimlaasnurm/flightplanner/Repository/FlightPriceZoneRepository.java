package com.siimlaasnurm.flightplanner.Repository;

import com.siimlaasnurm.flightplanner.Domain.FlightPriceZone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightPriceZoneRepository extends JpaRepository<FlightPriceZone, Integer> {
}
