package io.github.leandrogomides.nttMED.dto.responses;

import lombok.Data;

@Data
public class MedicoResponseListar {
    private Long id;
    private String nome;
    private String consulta;
    private double preco;

}
