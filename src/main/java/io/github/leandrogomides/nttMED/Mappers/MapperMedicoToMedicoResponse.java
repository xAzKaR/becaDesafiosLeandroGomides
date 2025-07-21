package io.github.leandrogomides.nttMED.Mappers;

import io.github.leandrogomides.nttMED.dto.responses.MedicoResponse;
import io.github.leandrogomides.nttMED.model.entities.Medico;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface MapperMedicoToMedicoResponse {

    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "tipoDeConsulta", target = "consulta")
    public MedicoResponse toResponse(Medico medico);
}
