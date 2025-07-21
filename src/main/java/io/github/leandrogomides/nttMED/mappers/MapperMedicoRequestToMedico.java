package io.github.leandrogomides.nttMED.mappers;

import io.github.leandrogomides.nttMED.dto.requests.MedicoRequest;
import io.github.leandrogomides.nttMED.model.entities.Medico;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface MapperMedicoRequestToMedico {

    Medico toModel(MedicoRequest medicoRequest);
}
