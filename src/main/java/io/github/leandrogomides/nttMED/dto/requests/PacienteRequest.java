package io.github.leandrogomides.nttMED.dto.requests;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PacienteRequest {
    private String nome;
    private LocalDate DataNascimento;
    private String email;
    private String telefone;
}
