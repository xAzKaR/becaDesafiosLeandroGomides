package io.github.leandrogomides.nttMED.dto.requests;

import lombok.*;

import java.time.LocalDate;

@Data
<<<<<<< HEAD
public class PacienteRequest {
    private Long id;
    private String nome;
    private LocalDate dataNascimento;
=======
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PacienteRequest {
    private String nome;
    private LocalDate DataNascimento;
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
    private String email;
    private String telefone;
}
