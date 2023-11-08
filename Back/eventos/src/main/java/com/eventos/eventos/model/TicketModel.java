package com.eventos.eventos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class TicketModel {
    @Id
    private String codTicket;
    private int price;
//    @ManyToOne  // Assume que um evento está associado a uma única organização
//    @JoinColumn(name = "cpf", referencedColumnName = "cpf")
    private String cpf;
//    @ManyToOne  // Assume que um evento está associado a uma única organização
//    @JoinColumn(name = "cnpj", referencedColumnName = "cnpj")
    private String cnpj;
//    @ManyToOne  // Assume que um evento está associado a uma única organização
//    @JoinColumn(name = "idEvent", referencedColumnName = "id")
    private String idEvent;
}
