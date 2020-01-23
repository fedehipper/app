package com.demo.compose.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Departamento {
    
    @Id
    private Long id;
    private String numero;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
}
