package io.github.leandrogomides.nttMED.Mappers;

import io.github.leandrogomides.nttMED.dto.requests.ConsultaRequest;
import io.github.leandrogomides.nttMED.model.entities.Consulta;
import org.mapstruct.Mapper;

@Mapper
public interface MapperConsultaRequestToConsulta {
    public Consulta toModel(ConsultaRequest consultaRequest);
}
