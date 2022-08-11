package com.listaTelefonica.lista.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ListaDeTelefone")
public class TelefoneModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(length = 2, nullable = false)
    private String ddd;
    @Column(length = 9, nullable = false)
    private String numero;
}
