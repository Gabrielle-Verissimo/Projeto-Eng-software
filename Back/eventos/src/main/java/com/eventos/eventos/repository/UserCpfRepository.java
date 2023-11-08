package com.eventos.eventos.repository;

import com.eventos.eventos.model.UserCpfModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCpfRepository extends JpaRepository<UserCpfModel, String> {
}
