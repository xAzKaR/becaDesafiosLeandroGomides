package io.github.leandrogomides.nttMED.dto.responses;

import io.github.leandrogomides.nttMED.dto.requests.MedicoRequest;
import io.github.leandrogomides.nttMED.dto.requests.PacienteRequest;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ConsultaResponse {
    private LocalDate data;
    private MedicoRequest medico;
    private PacienteRequest paciente;
}
