package io.github.leandrogomides.nttMED.mappers;

import io.github.leandrogomides.nttMED.dto.responses.PacienteResponse;
import io.github.leandrogomides.nttMED.model.entities.Paciente;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface MapperPacienteToPacienteResponse {
    PacienteResponse toResponse(Paciente paciente);
}
