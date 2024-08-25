package com.example.myapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String identificacao;
    private String modelo;
    private String marca;
    private String categoria;
    private int anoFabricacao;
    private int anoCompra;
    private String tipoCombustivel;
    private int quantidadePassageiros;
    private String habilitacaoMinima;
    private int quilometragem;

    // Getters e Setters
}
