package io.github.leandrogomides.nttMED.mappers;

import io.github.leandrogomides.nttMED.dto.requests.PacienteRequest;
import io.github.leandrogomides.nttMED.model.entities.Paciente;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface MapperPacienteAtualizar {
    void atualizar(PacienteRequest pacienteRequest, @MappingTarget Paciente paciente);
}
