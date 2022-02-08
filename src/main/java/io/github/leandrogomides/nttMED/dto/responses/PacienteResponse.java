package io.github.leandrogomides.nttMED.dto.responses;

import lombok.*;

@Data
public class PacienteResponse {
    private Long id;
    private String nome;
    private String telefone;
    private String status = "Paciente criado com sucesso! ";
}
