package io.github.leandrogomides.nttMED.model.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Paciente() {
    }

    public Paciente(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    public double getValorTotal() {
        double total = 0;


        return total;
    }
}
