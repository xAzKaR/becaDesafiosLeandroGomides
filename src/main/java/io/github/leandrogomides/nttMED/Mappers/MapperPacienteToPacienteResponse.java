package io.github.leandrogomides.nttMED.Mappers;

import io.github.leandrogomides.nttMED.dto.responses.PacienteResponse;
import io.github.leandrogomides.nttMED.model.entities.Paciente;
import org.mapstruct.Mapper;

@Mapper
public interface MapperPacienteToPacienteResponse {
    public PacienteResponse toResponse(Paciente paciente);
}
