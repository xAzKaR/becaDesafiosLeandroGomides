package io.github.leandrogomides.nttMED.model.services;

import io.github.leandrogomides.nttMED.dto.requests.ConsultaRequest;
import io.github.leandrogomides.nttMED.dto.responses.ConsultaResponse;

import java.util.List;

public interface ConsultaService {

    ConsultaResponse criar(ConsultaRequest consultaRequest);

    void deletar(Long id);

    ConsultaResponse atualizar(ConsultaRequest consultaRequest, Long id);

    ConsultaResponse obter(Long id);

    List<ConsultaResponse> listar();
}
