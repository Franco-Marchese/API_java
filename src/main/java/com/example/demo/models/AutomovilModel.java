package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "automovil")
public class AutomovilModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String patente;
    private String modelo;
    private Integer valor;

    // Obtener id
    public Long getId() {
        return id;
    }

    // Cambiar id
    public void setId(Long id) {
        this.id = id;
    }

    // Obtener patente
    public String getPatente() {
        return patente;
    }

    // Cambiar patente
    public void setPatente(String patente) {
        this.patente = patente;
    }

    // Obtener modelo
    public String getModelo() {
        return modelo;
    }

    // Cambiar modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Obtener valor
    public Integer getValor() {
        return valor;
    }

    // Cambiar valor
    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
