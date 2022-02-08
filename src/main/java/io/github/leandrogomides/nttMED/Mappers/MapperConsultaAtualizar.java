package io.github.leandrogomides.nttMED.Mappers;

import io.github.leandrogomides.nttMED.dto.requests.ConsultaRequest;
import io.github.leandrogomides.nttMED.model.entities.Consulta;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperConsultaAtualizar {
    public void atualizar(ConsultaRequest consultaRequest, @MappingTarget Consulta consulta);
}
