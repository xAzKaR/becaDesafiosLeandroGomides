package io.github.leandrogomides.nttMED.dto.responses;

import io.github.leandrogomides.nttMED.model.entities.Paciente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class PacienteResponse {
    private Long id;
    private String nome;

    public static PacienteResponse transformaEmDTO(Paciente paciente){
        return new PacienteResponse(paciente.getId(), paciente.getNome());
    }
}
