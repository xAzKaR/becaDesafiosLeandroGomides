package io.github.leandrogomides.nttMED.model.services;

import io.github.leandrogomides.nttMED.dto.requests.ConsultaRequest;
import io.github.leandrogomides.nttMED.dto.responses.ConsultaResponse;
<<<<<<< HEAD
=======
import io.github.leandrogomides.nttMED.model.entities.Consulta;
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a

import java.util.List;

public interface ConsultaService {

    public ConsultaResponse criar(ConsultaRequest consultaRequest);

    public void deletar(Long id);

    public ConsultaResponse atualizar(ConsultaRequest consultaRequest, Long id);

    public ConsultaResponse obter(Long id);

    public List<ConsultaResponse> listar();
}
