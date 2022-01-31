package io.github.leandrogomides.nttMED.model.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String tipoDeConsulta;

    private double preco;


    public Medico() {
    }

    public Medico(Long id, String nome, String tipoDeConsulta, double preco) {
        this.id = id;
        this.nome = nome;
        this.tipoDeConsulta = tipoDeConsulta;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDeConsulta() {
        return tipoDeConsulta;
    }

    public void setTipoDeConsulta(String tipoDeConsulta) {
        this.tipoDeConsulta = tipoDeConsulta;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
