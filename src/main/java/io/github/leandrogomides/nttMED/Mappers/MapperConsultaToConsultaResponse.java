package io.github.leandrogomides.nttMED.Mappers;

import io.github.leandrogomides.nttMED.dto.responses.ConsultaResponse;
import io.github.leandrogomides.nttMED.model.entities.Consulta;
import org.mapstruct.Mapper;

@Mapper
public interface MapperConsultaToConsultaResponse {
    public ConsultaResponse toResponse(Consulta consulta);
}
