package io.github.leandrogomides.nttMED.dto.requests;

import io.github.leandrogomides.nttMED.dto.responses.MedicoResponse;
import io.github.leandrogomides.nttMED.dto.responses.PacienteResponse;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ConsultaRequest {
    private Long id;
    private LocalDate data;
    private MedicoRequest medico;
    private PacienteRequest paciente;
}
