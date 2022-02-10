package io.github.leandrogomides.nttMED.dto.responses;

import lombok.Data;

@Data
public class MedicoResponseAtualizar {
    private Long id;
    private String nome;
    private String consulta;
    private String status = "Médico atualizado com sucesso!";
}
