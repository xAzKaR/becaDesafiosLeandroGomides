package io.github.leandrogomides.nttMED.model.services;

import io.github.leandrogomides.nttMED.model.entities.Consulta;
import io.github.leandrogomides.nttMED.model.entities.Consultorio;
import io.github.leandrogomides.nttMED.model.entities.Medico;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultorioService {

    public Consultorio criar(Consultorio consultorio) {
        consultorio.setId(1L);

        return consultorio;
    }


    public void deletar(Long id) {
//        return ResponseEntity.noContent().build();
    }


    public Consultorio atualizar(Consultorio consultorio, Long id) {
        consultorio.setId(id);

        return consultorio;
    }


    public Consultorio obter(Long id) {
        Consultorio consulta1 = new Consultorio(new Consulta(new Medico(1L, "João", "Ortopedia", 155.99)));
        consulta1.setId(1L);

        return consulta1;
    }


    public List<Consultorio> listar() {
        Consultorio sala1 = new Consultorio(new Consulta(new Medico(1L, "João", "Ortopedia", 155.99)));
        sala1.setId(1L);

        Consultorio sala2 = new Consultorio(new Consulta(new Medico(2L, "Mateus", "Pediatria", 155.99)));
        sala2.setId(2L);

        Consultorio sala3 = new Consultorio(new Consulta(new Medico(3L, "Joana", "Pediatria", 99.55)));
        sala3.setId(3L);

        Consultorio sala4 = new Consultorio();
        sala4.setId(4L);
        sala4.adicionarConsulta(1L, "João", "Ortopedia", 155.99);

        return List.of(sala1, sala2, sala3, sala4);
    }

}
