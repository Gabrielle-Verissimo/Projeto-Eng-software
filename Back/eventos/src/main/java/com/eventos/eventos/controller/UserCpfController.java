package com.eventos.eventos.controller;

import com.eventos.eventos.model.UserCpfModel;
import com.eventos.eventos.service.UserCpfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserCpfController {

    @Autowired
    UserCpfService service;

    @GetMapping("/user-cpf/{cpf}")
    public ResponseEntity<Object> getByCpf(@PathVariable (value = "cpf") String cpf){
        Optional<UserCpfModel> user = service.findByCpf(cpf);
        if (user.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(user.get());
    }

    @PostMapping("/user-cpf/register")
    public ResponseEntity<UserCpfModel> registerStudent(@RequestBody UserCpfModel user) {
        UserCpfModel userCreated = service.create(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }
}
