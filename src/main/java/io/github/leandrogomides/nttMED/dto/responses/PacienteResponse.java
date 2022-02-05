package io.github.leandrogomides.nttMED.dto.responses;

import io.github.leandrogomides.nttMED.model.entities.Paciente;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PacienteResponse {
    private Long id;
    private String nome;
    private String telefone;
}
