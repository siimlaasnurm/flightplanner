package com.siimlaasnurm.flightplanner.Repository;

import com.siimlaasnurm.flightplanner.Domain.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplaneRepository extends JpaRepository<Airplane, Integer> {
}
