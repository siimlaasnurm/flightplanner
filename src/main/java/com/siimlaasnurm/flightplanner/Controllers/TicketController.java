package com.siimlaasnurm.flightplanner.Controllers;

import com.siimlaasnurm.flightplanner.Repository.TicketRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    private final TicketRepository ticketRepository;

    public TicketController(TicketRepository repository) {
        this.ticketRepository = repository;
    }

}
