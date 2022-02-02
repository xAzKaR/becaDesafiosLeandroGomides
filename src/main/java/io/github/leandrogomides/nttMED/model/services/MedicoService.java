package io.github.leandrogomides.nttMED.model.services;

import io.github.leandrogomides.nttMED.dto.requests.MedicoRequest;
import io.github.leandrogomides.nttMED.dto.responses.MedicoResponse;
import io.github.leandrogomides.nttMED.model.entities.Medico;

import java.util.List;


public interface MedicoService {

    public MedicoResponse criar(MedicoRequest medicoRequest);

    public Medico atualizar(Medico medicoAtualizado, Long id);

    public void deletar(Long id);

//    public Iterable<Medico> listarTodos(int numeroPagina, int qtdePagina);

    public List<Medico> listar();

    public Medico obter(Long id);

}
