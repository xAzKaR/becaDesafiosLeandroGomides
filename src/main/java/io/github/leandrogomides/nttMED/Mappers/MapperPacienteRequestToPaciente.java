package io.github.leandrogomides.nttMED.Mappers;

import io.github.leandrogomides.nttMED.dto.requests.PacienteRequest;
import io.github.leandrogomides.nttMED.model.entities.Paciente;
import org.mapstruct.Mapper;

@Mapper
public interface MapperPacienteRequestToPaciente {

    public Paciente toModel(PacienteRequest pacienteRequest);
}
