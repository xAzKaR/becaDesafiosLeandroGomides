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
<<<<<<< HEAD
    private String status = "Consulta marcada com sucesso! ";
=======
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
}
