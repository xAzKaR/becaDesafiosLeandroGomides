package io.github.leandrogomides.nttMED.model.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    public Consulta() {
    }

    public void Medico() {
    }

    public void Paciente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Consulta(Long id, LocalDate data, Medico medico, Paciente paciente) {
        this.id = id;
        this.data = data;
        this.medico = medico;
        this.paciente = paciente;
    }
}
