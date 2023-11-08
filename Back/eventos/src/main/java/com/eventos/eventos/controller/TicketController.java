package com.eventos.eventos.controller;

import com.eventos.eventos.model.TicketModel;
import com.eventos.eventos.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class TicketController {
    @Autowired
    TicketService service;

    @GetMapping("/ticket/{codTicket}")
    public ResponseEntity<Object> getByCod(@PathVariable(value = "codTicket") String codTicket){
        Optional<TicketModel> ticket = service.findByCod(codTicket);
        if (ticket.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(ticket.get());
    }

    @PostMapping("/ticket/register")
    public ResponseEntity<TicketModel> registerStudent(@RequestBody TicketModel ticket) {
        TicketModel ticketCreated = service.create(ticket);
        return ResponseEntity.status(HttpStatus.CREATED).body(ticketCreated);
    }
}
