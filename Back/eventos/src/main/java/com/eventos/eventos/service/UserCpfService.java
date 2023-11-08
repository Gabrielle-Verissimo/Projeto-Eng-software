package com.eventos.eventos.service;

import com.eventos.eventos.model.UserCpfModel;
import com.eventos.eventos.repository.UserCpfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserCpfService {
    @Autowired
    UserCpfRepository repository;

    public UserCpfModel create(UserCpfModel user) {return repository.save(user);}

    public Optional<UserCpfModel> findByCpf(String cpf) { return repository.findById(cpf); }

    public void delete(String cpf) { repository.deleteById(cpf); }
}
