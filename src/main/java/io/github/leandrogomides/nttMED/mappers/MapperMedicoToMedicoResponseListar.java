package io.github.leandrogomides.nttMED.mappers;

import io.github.leandrogomides.nttMED.dto.responses.MedicoResponseListar;
import io.github.leandrogomides.nttMED.model.entities.Medico;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface MapperMedicoToMedicoResponseListar {

    @Mapping(source = "tipoDeConsulta", target = "consulta")
    @Mapping(source = "preco", target = "preco")
    MedicoResponseListar toResponse(Medico medico);
}
