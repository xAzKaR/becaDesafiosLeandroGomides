package io.github.leandrogomides.nttMED.Mappers;

import io.github.leandrogomides.nttMED.dto.responses.MedicoResponseListar;
import io.github.leandrogomides.nttMED.model.entities.Medico;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface MapperMedicoToMedicoResponseListar {

    @Mapping(source = "tipoDeConsulta", target = "consulta")
    public MedicoResponseListar toResponse(Medico medico);
}
