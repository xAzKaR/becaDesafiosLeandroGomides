package io.github.leandrogomides.nttMED.model.servicesImplements;

import io.github.leandrogomides.nttMED.Mappers.MapperMedicoAtualizar;
import io.github.leandrogomides.nttMED.Mappers.MapperMedicoRequestToMedico;
import io.github.leandrogomides.nttMED.Mappers.MapperMedicoToMedicoResponse;
import io.github.leandrogomides.nttMED.dto.requests.MedicoRequest;
import io.github.leandrogomides.nttMED.dto.responses.MedicoResponse;
import io.github.leandrogomides.nttMED.model.entities.Medico;
import io.github.leandrogomides.nttMED.model.repositories.MedicoRepository;
import io.github.leandrogomides.nttMED.model.services.MedicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class MedicoImplements implements MedicoService {


    private final MedicoRepository medicoRepository;
    private final MapperMedicoRequestToMedico mapperMedicoRequestToMedico;
    private final MapperMedicoToMedicoResponse mapperMedicoToMedicoResponse;
    private final MapperMedicoAtualizar mapperMedicoAtualizar;


    @Override
    public MedicoResponse criar(MedicoRequest medicoRequest) {

        Medico medicoCriado = mapperMedicoRequestToMedico.toModel(medicoRequest);

        medicoRepository.save(medicoCriado);

        MedicoResponse retornoMedico = mapperMedicoToMedicoResponse.toResponse(medicoCriado);

        return retornoMedico;
    }

    @Override
    public MedicoResponse atualizar(MedicoRequest medicoRequest, Long id) {
        Medico medico = medicoRepository.findById(id).get();

        mapperMedicoAtualizar.atualizar(medicoRequest, medico);

        medicoRepository.save(medico);

        MedicoResponse medicoResponse = mapperMedicoToMedicoResponse.toResponse(medico);

        return medicoResponse;
    }

    @Override
    public void deletar(Long id) {
        medicoRepository.deleteById(id);
    }


    @Override
    public List<MedicoResponse> listar() {
        List<Medico> listaMedico = (List<Medico>) medicoRepository.findAll();

        return listaMedico
                .stream()
                .map(mapperMedicoToMedicoResponse::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public MedicoResponse obter(Long id) {
        Medico medico = medicoRepository.findById(id).get();

        if (medico == null) {
            throw new RuntimeException("Médico com esse ID não foi encontrado ");
        }
        return mapperMedicoToMedicoResponse.toResponse(medico);
    }
}
