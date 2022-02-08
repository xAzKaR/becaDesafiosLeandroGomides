package io.github.leandrogomides.nttMED.Mappers;

import io.github.leandrogomides.nttMED.dto.responses.MedicoResponseAtualizar;
import io.github.leandrogomides.nttMED.model.entities.Medico;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface MapperMedicoToMedicoResponseAtualizar {

    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "tipoDeConsulta" , target = "consulta")
    public MedicoResponseAtualizar toResponse(Medico medico);
}
