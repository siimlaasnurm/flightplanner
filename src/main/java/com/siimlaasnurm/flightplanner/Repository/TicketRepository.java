package com.siimlaasnurm.flightplanner.Repository;

import com.siimlaasnurm.flightplanner.Domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
