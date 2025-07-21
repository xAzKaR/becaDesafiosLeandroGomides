package io.github.leandrogomides.nttMED.mappers;

import io.github.leandrogomides.nttMED.dto.responses.MedicoResponse;
import io.github.leandrogomides.nttMED.model.entities.Medico;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface MapperMedicoToMedicoResponse {

    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "tipoDeConsulta", target = "consulta")
    MedicoResponse toResponse(Medico medico);
}
