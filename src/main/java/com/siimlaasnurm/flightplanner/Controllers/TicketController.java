package com.siimlaasnurm.flightplanner.Controllers;

import com.siimlaasnurm.flightplanner.Domain.Ticket;
import com.siimlaasnurm.flightplanner.Repository.TicketRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    private final TicketRepository ticketRepository;

    public TicketController(TicketRepository repository) {
        this.ticketRepository = repository;
    }

    @GetMapping("/new")
    public Ticket getNewTicket() {
        return new Ticket();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addTicket(@RequestBody Ticket ticket) {
        ticketRepository.save(ticket);
        ticketRepository.flush();
    }

}
