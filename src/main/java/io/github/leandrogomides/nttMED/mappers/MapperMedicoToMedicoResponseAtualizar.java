package io.github.leandrogomides.nttMED.mappers;

import io.github.leandrogomides.nttMED.dto.responses.MedicoResponseAtualizar;
import io.github.leandrogomides.nttMED.model.entities.Medico;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface MapperMedicoToMedicoResponseAtualizar {

    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "tipoDeConsulta" , target = "consulta")
    MedicoResponseAtualizar toResponse(Medico medico);
}
