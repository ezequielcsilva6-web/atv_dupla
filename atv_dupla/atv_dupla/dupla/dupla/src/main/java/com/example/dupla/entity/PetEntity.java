package com.example.dupla.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tab_pet")
public class PetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="nome",nullable = false)
    private String nome;

    @Column(name ="especie",nullable = false)
    private String especie; // Adicionado para corresponder ao modelo[cite: 6]

    @Column(name ="raca",nullable = false)
    private String raca;

    @Column(name = "cliente_id", nullable = false)
    private Long clienteId; // Adição do campo clientId / clienteId[cite: 6]
}