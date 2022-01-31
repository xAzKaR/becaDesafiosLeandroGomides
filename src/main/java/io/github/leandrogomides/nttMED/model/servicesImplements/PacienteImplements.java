package io.github.leandrogomides.nttMED.model.servicesImplements;

import io.github.leandrogomides.nttMED.model.entities.Paciente;
import io.github.leandrogomides.nttMED.model.services.PacienteService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteImplements implements PacienteService {

    List<Paciente> listaPaciente = new ArrayList<>();
    Long id = 0L;

    @Override
    public Paciente criar(Paciente paciente) {
        listaPaciente.add(new Paciente(++id, paciente.getNome()));

        return paciente;
    }

    @Override
    public void deletar(Long id) {
        for (int i = 0; i < listaPaciente.size(); i++) {
            if (listaPaciente.get(i).getId() == id) {
                listaPaciente.remove(i);
            }

        }
    }

    @Override
    public Paciente atualizar(Paciente pacienteAtualizado, Long id) {
        Paciente paciente = null;

        for (int i = 0; i < listaPaciente.size(); i++) {
            if (listaPaciente.get(i).getId() == id) {
                paciente = listaPaciente.set(i, pacienteAtualizado);
            }

        }
        return paciente;
    }

    @Override
    public Paciente obter(Long id) {
        Paciente paciente = null;

        for (int i = 0; i < listaPaciente.size(); i++) {
            if (listaPaciente.get(i).getId() == id) {
                paciente = listaPaciente.get(i);
            }

        }
        return paciente;
    }

    @Override
    public List<Paciente> listar() {
        for (Paciente pacientes : listaPaciente) {
            System.out.println(pacientes);

        }
        return listaPaciente;
    }
}
