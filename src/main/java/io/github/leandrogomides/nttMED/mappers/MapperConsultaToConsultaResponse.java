package io.github.leandrogomides.nttMED.mappers;

import io.github.leandrogomides.nttMED.dto.responses.ConsultaResponse;
import io.github.leandrogomides.nttMED.model.entities.Consulta;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface MapperConsultaToConsultaResponse {
    ConsultaResponse toResponse(Consulta consulta);
}
