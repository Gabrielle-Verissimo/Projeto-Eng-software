package com.eventos.eventos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class EventModel {
    @Id
    private String id;
    private String Title;
//
//    @ManyToOne  // Assume que um evento está associado a uma única organização
//    @JoinColumn(name = "cnpj", referencedColumnName = "cnpj")
    private String cnpj;
//    @OneToMany
//    @JoinColumn(name = "cod_ticket", referencedColumnName = "cod_ticket")
    private String codTicket;
    private String local;
    private String description;
    private String date;
    private String time;
    private int qtdTicketsSold;
}
