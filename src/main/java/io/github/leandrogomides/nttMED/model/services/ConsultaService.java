package io.github.leandrogomides.nttMED.model.services;

import io.github.leandrogomides.nttMED.model.entities.Consulta;
import io.github.leandrogomides.nttMED.model.entities.Medico;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {


    public Consulta criar(Consulta consulta) {
        consulta.setId(1L);

        return consulta;
    }

    public void deletar(Long id) {
//        consultaRepository.deleteById(id);
    }

    public Consulta atualizar(Consulta consulta, Long id) {
        consulta.setId(id);

        return consulta;
    }


    public Consulta obter(Long id) {
        Consulta consulta = new Consulta(new Medico(1L, "João", "Ortopedia", 155));
        consulta.setId(1L);

        Medico medico1 = new Medico(2L, "João", "Ortopedia", 155.99);
        Consulta consulta2 = new Consulta(2L, medico1);
        consulta2.setId(2L);

        return consulta2;
    }

    public List<Consulta> listar() {
        Consulta consulta1 = new Consulta(new Medico(1L, "Jorge", "Ortopedia", 155.99));
        consulta1.setId(1L);

        Consulta consulta2 = new Consulta(new Medico(2L, "Amanda", "Pediatria", 122.51));
        consulta2.setId(2L);

        Consulta consulta3 = new Consulta(new Medico(3L, "Joana", "Quiropraxia", 88.55));
        consulta3.setId(3L);

        Medico medico1 = new Medico(1L, "João", "Ortopedia", 155.99);
        Consulta consulta4 = new Consulta(medico1);

        return List.of(consulta1, consulta2, consulta3, consulta4);
    }
}
