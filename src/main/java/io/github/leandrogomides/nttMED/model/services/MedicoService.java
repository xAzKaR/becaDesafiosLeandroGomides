package io.github.leandrogomides.nttMED.model.services;

import io.github.leandrogomides.nttMED.dto.requests.MedicoRequest;
import io.github.leandrogomides.nttMED.dto.responses.MedicoResponse;
<<<<<<< HEAD
import io.github.leandrogomides.nttMED.dto.responses.MedicoResponseAtualizar;
import io.github.leandrogomides.nttMED.dto.responses.MedicoResponseListar;
=======
<<<<<<< HEAD
import io.github.leandrogomides.nttMED.dto.responses.MedicoResponseAtualizar;
import io.github.leandrogomides.nttMED.dto.responses.MedicoResponseListar;
=======
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37

import java.util.List;

public interface MedicoService{

    MedicoResponse criar(MedicoRequest MedicoRequest);

<<<<<<< HEAD
    MedicoResponseAtualizar atualizar(MedicoRequest medicoRequest, Long id);
=======
<<<<<<< HEAD
    MedicoResponseAtualizar atualizar(MedicoRequest medicoRequest, Long id);
=======
    MedicoResponse atualizar(MedicoRequest medicoRequest, Long id);
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37

    void deletar(Long id);

//    public Iterable<Medico> listarTodos(int numeroPagina, int qtdePagina);

<<<<<<< HEAD
    List<MedicoResponseListar> listar();
=======
<<<<<<< HEAD
    List<MedicoResponseListar> listar();
=======
    List<MedicoResponse> listar();
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37

    MedicoResponse obter(Long id);

}
