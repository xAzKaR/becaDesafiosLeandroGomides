package io.github.leandrogomides.nttMED.model.servicesImplements;

import io.github.leandrogomides.nttMED.model.entities.Consulta;
import io.github.leandrogomides.nttMED.model.services.ConsultaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConsultaImplements implements ConsultaService {

    List<Consulta> listaConsulta = new ArrayList<>();
    Long id = 0L;

    @Override
    public Consulta criar(Consulta consulta) {
        listaConsulta.add(new Consulta(consulta.getId(), consulta.getData(), consulta.getMedico(), consulta.getPaciente()));

        return consulta;
    }

    @Override
    public void deletar(Long id) {
        for (int i = 0; i < listaConsulta.size(); i++) {
            if (listaConsulta.get(i).getId() == id) {
                listaConsulta.remove(i);
            }
        }

    }

    @Override
    public Consulta atualizar(Consulta consultaAtualizada, Long id) {
        Consulta consulta = null;

        for (int i = 0; i < listaConsulta.size(); i++) {

            if (listaConsulta.get(i).getId() == id)
                consulta = listaConsulta.set(i, consultaAtualizada);
        }

        return consulta;
    }

    @Override
    public Consulta obter(Long id) {
        return null;
    }

    @Override
    public List<Consulta> listar() {

        for (Consulta consultas : listaConsulta) {
            System.out.println(consultas);
        }

        return listaConsulta;
    }
}
