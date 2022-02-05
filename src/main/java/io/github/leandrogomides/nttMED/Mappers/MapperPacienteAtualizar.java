package io.github.leandrogomides.nttMED.Mappers;

import io.github.leandrogomides.nttMED.dto.requests.PacienteRequest;
import io.github.leandrogomides.nttMED.model.entities.Paciente;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperPacienteAtualizar {
    public void atualizar(PacienteRequest pacienteRequest, @MappingTarget Paciente paciente);
}
