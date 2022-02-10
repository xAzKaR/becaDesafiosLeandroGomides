package io.github.leandrogomides.nttMED.dto.requests;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import io.github.leandrogomides.nttMED.dto.responses.MedicoResponse;
import io.github.leandrogomides.nttMED.dto.responses.PacienteResponse;
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
import lombok.Data;

import java.time.LocalDate;

@Data
public class ConsultaRequest {
    private Long id;
    private LocalDate data;
    private MedicoRequest medico;
    private PacienteRequest paciente;
}
