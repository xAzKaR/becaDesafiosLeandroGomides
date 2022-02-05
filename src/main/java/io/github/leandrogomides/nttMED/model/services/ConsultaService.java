package io.github.leandrogomides.nttMED.model.services;

import io.github.leandrogomides.nttMED.dto.requests.ConsultaRequest;
import io.github.leandrogomides.nttMED.dto.responses.ConsultaResponse;
import io.github.leandrogomides.nttMED.model.entities.Consulta;

import java.util.List;

public interface ConsultaService {

    public ConsultaResponse criar(ConsultaRequest consultaRequest);

    public void deletar(Long id);

    public ConsultaResponse atualizar(ConsultaRequest consultaRequest, Long id);

    public ConsultaResponse obter(Long id);

    public List<ConsultaResponse> listar();
}
