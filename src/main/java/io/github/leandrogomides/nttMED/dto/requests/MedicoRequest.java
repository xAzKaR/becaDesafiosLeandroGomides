package io.github.leandrogomides.nttMED.dto.requests;

import lombok.Data;

@Data
public class MedicoRequest {
    private Long id;
    private String nome;
    private String tipoDeConsulta;
    private double preco;
}
