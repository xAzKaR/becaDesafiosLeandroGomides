package io.github.leandrogomides.nttMED.model.services;

import io.github.leandrogomides.nttMED.model.entities.Paciente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    public Paciente criar(Paciente paciente) {
        System.out.println(paciente);
        paciente.setId(1L);

        return paciente;
    }

    public void deletar(Long id) {
//        return ResponseEntity.noContent().build();
    }

    public Paciente atualizar(Paciente paciente, Long id) {
        paciente.setId(id);

        return paciente;
    }


    public Paciente obter(Long id) {
        Paciente paciente1 = new Paciente(1L, "João");

        return paciente1;
    }

    public List<Paciente> listar() {
        Paciente paciente1 = new Paciente(1L, "Matheus");
        Paciente paciente2 = new Paciente(2L, "Erick");
        Paciente paciente3 = new Paciente(3L, "Joana");

        return List.of(paciente1, paciente2, paciente3);
    }
}
