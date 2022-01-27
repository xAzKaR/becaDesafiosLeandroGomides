package io.github.leandrogomides.nttMED.model.services;

import io.github.leandrogomides.nttMED.model.entities.Paciente;

import java.util.ArrayList;
import java.util.List;

public interface PacienteService {

    public Paciente criar(Paciente paciente);

    public void deletar(Long id);

    public Paciente atualizar(Paciente paciente, Long id);

    public Paciente obter(Long id);

    public List<Paciente> listar();
}
