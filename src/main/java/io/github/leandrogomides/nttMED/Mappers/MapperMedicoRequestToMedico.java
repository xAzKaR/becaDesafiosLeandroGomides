package io.github.leandrogomides.nttMED.Mappers;

import io.github.leandrogomides.nttMED.dto.requests.MedicoRequest;
import io.github.leandrogomides.nttMED.model.entities.Medico;
import org.mapstruct.Mapper;

@Mapper
public interface MapperMedicoRequestToMedico {

    public Medico toModel(MedicoRequest medicoRequest);
}
