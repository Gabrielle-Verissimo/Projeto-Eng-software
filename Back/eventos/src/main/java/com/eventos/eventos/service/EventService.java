package com.eventos.eventos.service;

import com.eventos.eventos.model.EventModel;
import com.eventos.eventos.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    EventRepository repository;

    public EventModel create(EventModel event) {return repository.save(event);}

    public Optional<EventModel> findById(String id) { return repository.findById(id); }
    public List<EventModel> findByLocal(String local) {
        return repository.findByLocal(local);
    }
    public void delete(String id) { repository.deleteById(id); }
}
