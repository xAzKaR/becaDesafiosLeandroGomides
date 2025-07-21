package io.github.leandrogomides.nttMED.model.servicesImplements;

import io.github.leandrogomides.nttMED.dto.requests.ConsultaRequest;
import io.github.leandrogomides.nttMED.dto.responses.ConsultaResponse;
import io.github.leandrogomides.nttMED.exception.ConsultaNotBeNullException;
import io.github.leandrogomides.nttMED.exception.ConsultaNotFoundException;
import io.github.leandrogomides.nttMED.mappers.MapperConsultaAtualizar;
import io.github.leandrogomides.nttMED.mappers.MapperConsultaRequestToConsulta;
import io.github.leandrogomides.nttMED.mappers.MapperConsultaToConsultaResponse;
import io.github.leandrogomides.nttMED.model.entities.Consulta;
import io.github.leandrogomides.nttMED.model.repositories.ConsultaRepository;
import io.github.leandrogomides.nttMED.model.services.ConsultaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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
        if (consultaRequest.getMedico().getNome() == null || consultaRequest.getPaciente().getNome() == null) {
            throw new ConsultaNotBeNullException("Consulta não cadastrada no sistema");
        }

        Consulta consulta = mapperConsultaRequestToConsulta.toModel(consultaRequest);
        consulta.setData(LocalDateTime.now().toLocalDate());

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
        if (consultaRepository.findById(id).get() == null) {
            throw new ConsultaNotFoundException("Consulta não está marcada no sistema");
        }

        Consulta consulta = consultaRepository.findById(id).get();

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
