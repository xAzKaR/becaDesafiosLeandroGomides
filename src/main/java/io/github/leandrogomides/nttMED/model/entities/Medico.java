package io.github.leandrogomides.nttMED.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Campo não informado")
    @Pattern(regexp = "^[A-Z]+(.)*", message = "O primeiro nome deve começar com letra maiúscula")
    private String nome;

    @NotBlank(message = "Campo não informado")
    private String tipoDeConsulta;

    @NotBlank(message = "Campo não informado")
    @Min(value = 1)
    private double preco;

}
