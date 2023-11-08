package com.eventos.eventos.service;

import com.eventos.eventos.model.UserCnpjModel;
import com.eventos.eventos.repository.UserCnpjRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserCnpjService {
    @Autowired
    UserCnpjRepository repository;

    public UserCnpjModel create(UserCnpjModel user) {return repository.save(user);}

    public Optional<UserCnpjModel> findByCnpj(String cnpj) { return repository.findById(cnpj); }

    public void delete(String cnpj) { repository.deleteById(cnpj); }
}
