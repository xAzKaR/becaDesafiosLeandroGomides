package io.github.leandrogomides.nttMED.model.services;

import io.github.leandrogomides.nttMED.dto.requests.PacienteRequest;
import io.github.leandrogomides.nttMED.dto.responses.PacienteResponse;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import io.github.leandrogomides.nttMED.model.entities.Paciente;
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37

import java.util.List;

public interface PacienteService {

    PacienteResponse criar(PacienteRequest pacienteRequest);

    void deletar(Long id);

    PacienteResponse atualizar(PacienteRequest pacienteRequest, Long id);

    PacienteResponse obter(Long id);

    List<PacienteResponse> listar();
}
