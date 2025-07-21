package io.github.leandrogomides.nttMED.mappers;

import io.github.leandrogomides.nttMED.dto.requests.PacienteRequest;
import io.github.leandrogomides.nttMED.model.entities.Paciente;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface MapperPacienteRequestToPaciente {

    Paciente toModel(PacienteRequest pacienteRequest);
}
