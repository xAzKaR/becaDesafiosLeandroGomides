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

    @NotBlank(message = "Campo não informado")
    @Email(message = "Campo inválido")
    private String email;

    @NotBlank(message = "Campo não informado")
    private String telefone;

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
}
