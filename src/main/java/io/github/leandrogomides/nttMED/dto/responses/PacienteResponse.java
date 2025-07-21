package io.github.leandrogomides.nttMED.dto.responses;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PacienteResponse {
    private Long id;
    private String nome;
    private String telefone;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;
    private String status = "Paciente criado com sucesso! ";
}
