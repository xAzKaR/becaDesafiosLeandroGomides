package io.github.leandrogomides.nttMED.model.services;

import io.github.leandrogomides.nttMED.model.entities.Consulta;
import io.github.leandrogomides.nttMED.model.entities.Consultorio;
import io.github.leandrogomides.nttMED.model.entities.Medico;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public interface ConsultorioService {



    public Consultorio criar(Consultorio consultorio);


    public void deletar(Long id);


    public Consultorio atualizar(Consultorio consultorio, Long id);


    public Consultorio obter(Long id);


    public List<Consultorio> listar();
}
