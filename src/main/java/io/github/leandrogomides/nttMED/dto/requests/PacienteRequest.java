package io.github.leandrogomides.nttMED.dto.requests;

import lombok.*;

import java.time.LocalDate;

@Data
public class PacienteRequest {
    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private String email;
    private String telefone;
}
