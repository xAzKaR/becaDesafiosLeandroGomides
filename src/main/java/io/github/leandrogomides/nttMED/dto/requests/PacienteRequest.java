package io.github.leandrogomides.nttMED.dto.requests;

import lombok.*;

import java.time.LocalDate;

@Data
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
public class PacienteRequest {
    private Long id;
    private String nome;
    private LocalDate dataNascimento;
<<<<<<< HEAD
=======
=======
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PacienteRequest {
    private String nome;
    private LocalDate DataNascimento;
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
    private String email;
    private String telefone;
}
