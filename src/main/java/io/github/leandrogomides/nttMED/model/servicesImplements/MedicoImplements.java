package io.github.leandrogomides.nttMED.model.servicesImplements;

import io.github.leandrogomides.nttMED.Mappers.*;
import io.github.leandrogomides.nttMED.dto.requests.MedicoRequest;
import io.github.leandrogomides.nttMED.dto.responses.MedicoResponse;
import io.github.leandrogomides.nttMED.dto.responses.MedicoResponseAtualizar;
import io.github.leandrogomides.nttMED.dto.responses.MedicoResponseListar;
import io.github.leandrogomides.nttMED.exception.MedicoNotBeNullException;
import io.github.leandrogomides.nttMED.exception.MedicoNotFoundException;
import io.github.leandrogomides.nttMED.model.entities.Medico;
import io.github.leandrogomides.nttMED.model.repositories.MedicoRepository;
import io.github.leandrogomides.nttMED.model.services.MedicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class MedicoImplements implements MedicoService {


    private final MedicoRepository medicoRepository;
    private final MapperMedicoRequestToMedico mapperMedicoRequestToMedico;
    private final MapperMedicoToMedicoResponse mapperMedicoToMedicoResponse;
    private final MapperMedicoAtualizar mapperMedicoAtualizar;
    private final MapperMedicoToMedicoResponseAtualizar mapperMedicoToMedicoResponseAtualizar;
    private final MapperMedicoToMedicoResponseListar mapperMedicoToMedicoResponseListar;


    @Override
    public MedicoResponse criar(MedicoRequest medicoRequest) {
        if (medicoRequest.getNome() == null || medicoRequest.getTipoDeConsulta() == null) {
            throw new MedicoNotBeNullException("Adicione os campos de médico");
        }

        Medico medicoCriado = mapperMedicoRequestToMedico.toModel(medicoRequest);


        medicoRepository.save(medicoCriado);

        MedicoResponse retornoMedico = mapperMedicoToMedicoResponse.toResponse(medicoCriado);

        return retornoMedico;
    }

    @Override
    public MedicoResponseAtualizar atualizar(MedicoRequest medicoRequest, Long id) {
        Medico medico = medicoRepository.findById(id).get();

        mapperMedicoAtualizar.atualizar(medicoRequest, medico);

        medicoRepository.save(medico);

        MedicoResponseAtualizar medicoResponse = mapperMedicoToMedicoResponseAtualizar.toResponse(medico);

        return medicoResponse;
    }

    @Override
    public void deletar(Long id) {
        medicoRepository.deleteById(id);
    }


    @Override
    public List<MedicoResponseListar> listar() {
        List<Medico> listaMedico = (List<Medico>) medicoRepository.findAll();

        return listaMedico
                .stream()
                .map(mapperMedicoToMedicoResponseListar::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public MedicoResponse obter(Long id) {
        if (medicoRepository.findById(id).get() == null) {
            throw new MedicoNotFoundException("Médico com esse ID não foi encontrado " + id);
        }
        Medico medico = medicoRepository.findById(id).get();

//
//        if (medico == null) {
//            throw new RuntimeException("Médico com esse ID não foi encontrado ");
//        }
        return mapperMedicoToMedicoResponse.toResponse(medico);
    }
}
