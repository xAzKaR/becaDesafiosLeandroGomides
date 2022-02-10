package io.github.leandrogomides.nttMED.model.servicesImplements;

import io.github.leandrogomides.nttMED.Mappers.MapperConsultaAtualizar;
import io.github.leandrogomides.nttMED.Mappers.MapperConsultaRequestToConsulta;
import io.github.leandrogomides.nttMED.Mappers.MapperConsultaToConsultaResponse;
import io.github.leandrogomides.nttMED.dto.requests.ConsultaRequest;
import io.github.leandrogomides.nttMED.dto.responses.ConsultaResponse;
import io.github.leandrogomides.nttMED.dto.responses.MedicoResponse;
import io.github.leandrogomides.nttMED.dto.responses.PacienteResponse;
<<<<<<< HEAD
import io.github.leandrogomides.nttMED.exception.ConsultaNotBeNullException;
import io.github.leandrogomides.nttMED.exception.ConsultaNotFoundException;
=======
<<<<<<< HEAD
import io.github.leandrogomides.nttMED.exception.ConsultaNotBeNullException;
import io.github.leandrogomides.nttMED.exception.ConsultaNotFoundException;
=======
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
import io.github.leandrogomides.nttMED.model.entities.Consulta;
import io.github.leandrogomides.nttMED.model.entities.Medico;
import io.github.leandrogomides.nttMED.model.repositories.ConsultaRepository;
import io.github.leandrogomides.nttMED.model.services.ConsultaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import javax.validation.Valid;
=======
<<<<<<< HEAD
import javax.validation.Valid;
=======
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ConsultaImplements implements ConsultaService {

    private final ConsultaRepository consultaRepository;
    private final MapperConsultaRequestToConsulta mapperConsultaRequestToConsulta;
    private final MapperConsultaToConsultaResponse mapperConsultaToConsultaResponse;
    private final MapperConsultaAtualizar mapperConsultaAtualizar;


    @Override
    public ConsultaResponse criar(ConsultaRequest consultaRequest) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
        if (consultaRequest.getMedico().getNome() == null || consultaRequest.getPaciente().getNome() == null) {
            throw new ConsultaNotBeNullException("Consulta não cadastrada no sistema");
        }

<<<<<<< HEAD
=======
=======
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
        Consulta consulta = mapperConsultaRequestToConsulta.toModel(consultaRequest);

        consultaRepository.save(consulta);

        ConsultaResponse retornoConsulta = mapperConsultaToConsultaResponse.toResponse(consulta);

        return retornoConsulta;
    }

    @Override
    public void deletar(Long id) {
        consultaRepository.deleteById(id);
    }

    @Override
    public ConsultaResponse atualizar(ConsultaRequest consultaRequest, Long id) {
        Consulta consulta = consultaRepository.findById(id).get();

        mapperConsultaAtualizar.atualizar(consultaRequest, consulta);

        consultaRepository.save(consulta);

        ConsultaResponse consultaResponse = mapperConsultaToConsultaResponse.toResponse(consulta);

        return consultaResponse;
    }

    @Override
    public ConsultaResponse obter(Long id) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
        if (consultaRepository.findById(id).get() == null) {
            throw new ConsultaNotFoundException("Consulta não está marcada no sistema");
        }

        Consulta consulta = consultaRepository.findById(id).get();

<<<<<<< HEAD
=======
=======
        Consulta consulta = consultaRepository.findById(id).get();

        if(consulta == null){
            throw new RuntimeException("Consulta não está marcada no sistema");
        }
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
        return mapperConsultaToConsultaResponse.toResponse(consulta);
    }

    @Override
    public List<ConsultaResponse> listar() {
        List<Consulta> listaConsultas = (List<Consulta>) consultaRepository.findAll();

        return listaConsultas
                .stream()
                .map(mapperConsultaToConsultaResponse::toResponse)
                .collect(Collectors.toList());
    }
}
