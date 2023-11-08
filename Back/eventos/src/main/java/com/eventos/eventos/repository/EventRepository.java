package com.eventos.eventos.repository;

import com.eventos.eventos.model.EventModel;
import com.eventos.eventos.model.UserCnpjModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<EventModel, String> {
    List<EventModel> findByLocal(String local);
}
