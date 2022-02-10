package io.github.leandrogomides.nttMED.model.servicesImplements;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
import io.github.leandrogomides.nttMED.Mappers.*;
import io.github.leandrogomides.nttMED.dto.requests.MedicoRequest;
import io.github.leandrogomides.nttMED.dto.responses.MedicoResponse;
import io.github.leandrogomides.nttMED.dto.responses.MedicoResponseAtualizar;
import io.github.leandrogomides.nttMED.dto.responses.MedicoResponseListar;
import io.github.leandrogomides.nttMED.exception.MedicoNotBeNullException;
import io.github.leandrogomides.nttMED.exception.MedicoNotFoundException;
<<<<<<< HEAD
=======
=======
import io.github.leandrogomides.nttMED.Mappers.MapperMedicoAtualizar;
import io.github.leandrogomides.nttMED.Mappers.MapperMedicoRequestToMedico;
import io.github.leandrogomides.nttMED.Mappers.MapperMedicoToMedicoResponse;
import io.github.leandrogomides.nttMED.dto.requests.MedicoRequest;
import io.github.leandrogomides.nttMED.dto.responses.MedicoResponse;
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
import io.github.leandrogomides.nttMED.model.entities.Medico;
import io.github.leandrogomides.nttMED.model.repositories.MedicoRepository;
import io.github.leandrogomides.nttMED.model.services.MedicoService;
import lombok.RequiredArgsConstructor;
<<<<<<< HEAD
import org.springframework.stereotype.Service;
=======
<<<<<<< HEAD
import org.springframework.stereotype.Service;
=======
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class MedicoImplements implements MedicoService {


    private final MedicoRepository medicoRepository;
    private final MapperMedicoRequestToMedico mapperMedicoRequestToMedico;
    private final MapperMedicoToMedicoResponse mapperMedicoToMedicoResponse;
    private final MapperMedicoAtualizar mapperMedicoAtualizar;
<<<<<<< HEAD
    private final MapperMedicoToMedicoResponseAtualizar mapperMedicoToMedicoResponseAtualizar;
    private final MapperMedicoToMedicoResponseListar mapperMedicoToMedicoResponseListar;
=======
<<<<<<< HEAD
    private final MapperMedicoToMedicoResponseAtualizar mapperMedicoToMedicoResponseAtualizar;
    private final MapperMedicoToMedicoResponseListar mapperMedicoToMedicoResponseListar;
=======
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37


    @Override
    public MedicoResponse criar(MedicoRequest medicoRequest) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
        if (medicoRequest.getNome() == null || medicoRequest.getTipoDeConsulta() == null) {
            throw new MedicoNotBeNullException("Adicione os campos de médico");
        }

        Medico medicoCriado = mapperMedicoRequestToMedico.toModel(medicoRequest);


<<<<<<< HEAD
=======
=======

        Medico medicoCriado = mapperMedicoRequestToMedico.toModel(medicoRequest);

>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
        medicoRepository.save(medicoCriado);

        MedicoResponse retornoMedico = mapperMedicoToMedicoResponse.toResponse(medicoCriado);

        return retornoMedico;
    }

    @Override
<<<<<<< HEAD
    public MedicoResponseAtualizar atualizar(MedicoRequest medicoRequest, Long id) {
=======
<<<<<<< HEAD
    public MedicoResponseAtualizar atualizar(MedicoRequest medicoRequest, Long id) {
=======
    public MedicoResponse atualizar(MedicoRequest medicoRequest, Long id) {
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
        Medico medico = medicoRepository.findById(id).get();

        mapperMedicoAtualizar.atualizar(medicoRequest, medico);

        medicoRepository.save(medico);

<<<<<<< HEAD
        MedicoResponseAtualizar medicoResponse = mapperMedicoToMedicoResponseAtualizar.toResponse(medico);
=======
<<<<<<< HEAD
        MedicoResponseAtualizar medicoResponse = mapperMedicoToMedicoResponseAtualizar.toResponse(medico);
=======
        MedicoResponse medicoResponse = mapperMedicoToMedicoResponse.toResponse(medico);
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37

        return medicoResponse;
    }

    @Override
    public void deletar(Long id) {
        medicoRepository.deleteById(id);
    }


    @Override
<<<<<<< HEAD
    public List<MedicoResponseListar> listar() {
=======
<<<<<<< HEAD
    public List<MedicoResponseListar> listar() {
=======
    public List<MedicoResponse> listar() {
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
        List<Medico> listaMedico = (List<Medico>) medicoRepository.findAll();

        return listaMedico
                .stream()
<<<<<<< HEAD
                .map(mapperMedicoToMedicoResponseListar::toResponse)
=======
<<<<<<< HEAD
                .map(mapperMedicoToMedicoResponseListar::toResponse)
=======
                .map(mapperMedicoToMedicoResponse::toResponse)
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
                .collect(Collectors.toList());
    }

    @Override
    public MedicoResponse obter(Long id) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
        if (medicoRepository.findById(id).get() == null) {
            throw new MedicoNotFoundException("Médico com esse ID não foi encontrado " + id);
        }
        Medico medico = medicoRepository.findById(id).get();

//
//        if (medico == null) {
//            throw new RuntimeException("Médico com esse ID não foi encontrado ");
//        }
<<<<<<< HEAD
=======
=======
        Medico medico = medicoRepository.findById(id).get();

        if (medico == null) {
            throw new RuntimeException("Médico com esse ID não foi encontrado ");
        }
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
        return mapperMedicoToMedicoResponse.toResponse(medico);
    }
}
