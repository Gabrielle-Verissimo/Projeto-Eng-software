package com.eventos.eventos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class UserCnpjModel implements Serializable {
    @Id
    @Column(length = 14)
    private String cnpj;
    private String name;
    private String phoneNumber;
    private String email;
    private String password;

}
