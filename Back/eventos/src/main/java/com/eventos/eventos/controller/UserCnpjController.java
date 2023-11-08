package com.eventos.eventos.controller;

import com.eventos.eventos.model.UserCnpjModel;
import com.eventos.eventos.service.UserCnpjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserCnpjController {

    @Autowired
    UserCnpjService service;

    @GetMapping("/user-cnpj/{cnpj}")
    public ResponseEntity<Object> getByCnpj(@PathVariable (value = "cnpj") String cnpj){
        Optional<UserCnpjModel> user = service.findByCnpj(cnpj);
        if (user.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(user.get());
    }

    @PostMapping("/user-cnpj/register")
    public ResponseEntity<UserCnpjModel> registerStudent(@RequestBody UserCnpjModel user) {
        UserCnpjModel userCreated = service.create(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }
}
