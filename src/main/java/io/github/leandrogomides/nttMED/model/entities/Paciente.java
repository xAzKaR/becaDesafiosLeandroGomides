package io.github.leandrogomides.nttMED.model.entities;

import io.github.leandrogomides.nttMED.dto.requests.PacienteRequest;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Campo não informado")
    @Pattern(regexp = "^[A-Z]+(.)*")
    private String nome;

    @NotBlank(message = "Campo não informado")
    private LocalDate dataNascimento;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
    @NotBlank(message = "Campo não informado")
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
    @Email(message = "Campo inválido")
    private String email;

    @NotBlank(message = "Campo não informado")
    private String telefone;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

    public Paciente(PacienteRequest pacienteRequest) {
        this.setNome(pacienteRequest.getNome());
        this.setDataNascimento(pacienteRequest.getDataNascimento());
        this.setEmail(pacienteRequest.getEmail());
        this.setTelefone(pacienteRequest.getTelefone());
    }

    public double getValorTotal() {
        double total = 0;
        return total;
    }
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
>>>>>>> 1d3f4432f9a597387515bf388fce07a874c43e37
}
