package io.github.leandrogomides.nttMED.model.services;

import io.github.leandrogomides.nttMED.dto.requests.PacienteRequest;
import io.github.leandrogomides.nttMED.dto.responses.PacienteResponse;
import io.github.leandrogomides.nttMED.model.entities.Paciente;

import java.util.List;

public interface PacienteService {

    public PacienteResponse criar(PacienteRequest pacienteRequest);

    public void deletar(Long id);

    public Paciente atualizar(Paciente paciente, Long id);

    public Paciente obter(Long id);

    public List<Paciente> listar();
}
