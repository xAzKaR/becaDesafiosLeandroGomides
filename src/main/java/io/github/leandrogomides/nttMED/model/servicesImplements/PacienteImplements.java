package io.github.leandrogomides.nttMED.model.servicesImplements;

import io.github.leandrogomides.nttMED.Mappers.MapperPacienteAtualizar;
import io.github.leandrogomides.nttMED.Mappers.MapperPacienteRequestToPaciente;
import io.github.leandrogomides.nttMED.Mappers.MapperPacienteToPacienteResponse;
import io.github.leandrogomides.nttMED.dto.requests.PacienteRequest;
import io.github.leandrogomides.nttMED.dto.responses.PacienteResponse;
<<<<<<< HEAD
import io.github.leandrogomides.nttMED.exception.PacienteNotBeNullException;
import io.github.leandrogomides.nttMED.exception.PacienteNotFoundException;
=======
<<<<<<< HEAD
import io.github.leandrogomides.nttMED.exception.PacienteNotBeNullException;
import io.github.leandrogomides.nttMED.exception.PacienteNotFoundException;
=======
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
import io.github.leandrogomides.nttMED.model.entities.Paciente;
import io.github.leandrogomides.nttMED.model.repositories.PacienteRepository;
import io.github.leandrogomides.nttMED.model.services.PacienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PacienteImplements implements PacienteService {

<<<<<<< HEAD
    private final PacienteRepository pacienteRepository;
=======
<<<<<<< HEAD
    private final PacienteRepository pacienteRepository;
=======
    private PacienteRepository pacienteRepository;
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
    private final MapperPacienteRequestToPaciente mapperPacienteRequestToPaciente;
    private final MapperPacienteToPacienteResponse mapperPacienteToPacienteResponse;
    private final MapperPacienteAtualizar mapperPacienteAtualizar;

    @Override
    public PacienteResponse criar(PacienteRequest pacienteRequest) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
        if (pacienteRequest.getNome() == null || pacienteRequest.getDataNascimento() == null) {
            throw new PacienteNotBeNullException("Preencha os campos do paciente");
        }

<<<<<<< HEAD
=======
=======
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
        Paciente pacienteCriado = mapperPacienteRequestToPaciente.toModel(pacienteRequest);

        pacienteRepository.save(pacienteCriado);

        PacienteResponse retornoPaciente = mapperPacienteToPacienteResponse.toResponse(pacienteCriado);
        return retornoPaciente;
    }

    @Override
    public void deletar(Long id) {
        pacienteRepository.deleteById(id);
    }

    @Override
    public PacienteResponse atualizar(PacienteRequest pacienteRequest, Long id) {
        Paciente paciente = pacienteRepository.findById(id).get();

        mapperPacienteAtualizar.atualizar(pacienteRequest, paciente);

        pacienteRepository.save(paciente);

        PacienteResponse pacienteResponse = mapperPacienteToPacienteResponse.toResponse(paciente);

        return pacienteResponse;
    }

    @Override
    public PacienteResponse obter(Long id) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
        if (pacienteRepository.findById(id).get() == null) {
            throw new PacienteNotFoundException("Paciente com esse ID não foi encontrado");
        }
        Paciente paciente = pacienteRepository.findById(id).get();

<<<<<<< HEAD
=======
=======
        Paciente paciente = pacienteRepository.findById(id).get();

        if (paciente == null) {
            throw new RuntimeException("Paciente com esse ID não foi encontrado");
        }
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
        return mapperPacienteToPacienteResponse.toResponse(paciente);
    }

    @Override
    public List<PacienteResponse> listar() {
        List<Paciente> listaPaciente = (List<Paciente>) pacienteRepository.findAll();

        return listaPaciente
                .stream()
                .map(mapperPacienteToPacienteResponse::toResponse)
                .collect(Collectors.toList());
    }
}
