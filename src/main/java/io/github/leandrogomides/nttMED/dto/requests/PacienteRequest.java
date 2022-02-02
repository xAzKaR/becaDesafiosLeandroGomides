package io.github.leandrogomides.nttMED.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class PacienteRequest {
    private String nome;
}
