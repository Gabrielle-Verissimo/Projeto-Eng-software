package com.eventos.eventos.repository;

import com.eventos.eventos.model.UserCnpjModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCnpjRepository extends JpaRepository<UserCnpjModel, String> {
}
