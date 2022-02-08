package io.github.leandrogomides.nttMED.model.servicesImplements;

import io.github.leandrogomides.nttMED.Mappers.MapperPacienteAtualizar;
import io.github.leandrogomides.nttMED.Mappers.MapperPacienteRequestToPaciente;
import io.github.leandrogomides.nttMED.Mappers.MapperPacienteToPacienteResponse;
import io.github.leandrogomides.nttMED.dto.requests.PacienteRequest;
import io.github.leandrogomides.nttMED.dto.responses.PacienteResponse;
import io.github.leandrogomides.nttMED.exception.PacienteNotBeNullException;
import io.github.leandrogomides.nttMED.exception.PacienteNotFoundException;
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

    private final PacienteRepository pacienteRepository;
    private final MapperPacienteRequestToPaciente mapperPacienteRequestToPaciente;
    private final MapperPacienteToPacienteResponse mapperPacienteToPacienteResponse;
    private final MapperPacienteAtualizar mapperPacienteAtualizar;

    @Override
    public PacienteResponse criar(PacienteRequest pacienteRequest) {
        if (pacienteRequest.getNome() == null || pacienteRequest.getDataNascimento() == null) {
            throw new PacienteNotBeNullException("Preencha os campos do paciente");
        }

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
        if (pacienteRepository.findById(id).get() == null) {
            throw new PacienteNotFoundException("Paciente com esse ID não foi encontrado");
        }
        Paciente paciente = pacienteRepository.findById(id).get();

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
