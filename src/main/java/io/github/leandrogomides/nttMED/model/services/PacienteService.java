package io.github.leandrogomides.nttMED.model.services;

import io.github.leandrogomides.nttMED.dto.requests.PacienteRequest;
import io.github.leandrogomides.nttMED.dto.responses.PacienteResponse;

import java.util.List;

public interface PacienteService {

    PacienteResponse criar(PacienteRequest pacienteRequest);

    void deletar(Long id);

    PacienteResponse atualizar(PacienteRequest pacienteRequest, Long id);

    PacienteResponse obter(Long id);

    List<PacienteResponse> listar();
}
