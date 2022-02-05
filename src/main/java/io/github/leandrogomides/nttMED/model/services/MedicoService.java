package io.github.leandrogomides.nttMED.model.services;

import io.github.leandrogomides.nttMED.dto.requests.MedicoRequest;
import io.github.leandrogomides.nttMED.dto.responses.MedicoResponse;

import java.util.List;

public interface MedicoService{

    MedicoResponse criar(MedicoRequest MedicoRequest);

    MedicoResponse atualizar(MedicoRequest medicoRequest, Long id);

    void deletar(Long id);

//    public Iterable<Medico> listarTodos(int numeroPagina, int qtdePagina);

    List<MedicoResponse> listar();

    MedicoResponse obter(Long id);

}
