package io.github.leandrogomides.nttMED.model.services;

import io.github.leandrogomides.nttMED.model.entities.Consulta;

import java.util.List;

public interface ConsultaService {

    public Consulta criar(Consulta consulta);

    public void deletar(Long id);

    public Consulta atualizar(Consulta consulta, Long id);

    public Consulta obter(Long id);

    public List<Consulta> listar();
}
