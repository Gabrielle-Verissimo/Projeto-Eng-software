package com.eventos.eventos.service;

import com.eventos.eventos.model.TicketModel;
import com.eventos.eventos.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketService {
    @Autowired
    TicketRepository repository;

    public TicketModel create(TicketModel ticket) {return repository.save(ticket);}

    public Optional<TicketModel> findByCod(String codTicket) { return repository.findById(codTicket); }

    public void delete(String codTicket) { repository.deleteById(codTicket); }
}
