package io.github.leandrogomides.nttMED.dto.requests;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ConsultaRequest {
    private Long id;
    private LocalDate data;
    private MedicoRequest medico;
    private PacienteRequest paciente;
}
