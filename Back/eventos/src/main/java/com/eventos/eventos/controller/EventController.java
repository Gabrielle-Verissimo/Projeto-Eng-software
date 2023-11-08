package com.eventos.eventos.controller;

import com.eventos.eventos.model.EventModel;
import com.eventos.eventos.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class EventController {
    @Autowired
    EventService service;

    @GetMapping("/event/{local}")
    public ResponseEntity<Object> getByLocal(@PathVariable(value = "local") String local){
        List<EventModel> event = service.findByLocal(local);
        if (event.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(event);
    }

    @PostMapping("/event/register")
    public ResponseEntity<EventModel> registerStudent(@RequestBody EventModel event) {
        EventModel eventCreated = service.create(event);
        return ResponseEntity.status(HttpStatus.CREATED).body(eventCreated);
    }
}
