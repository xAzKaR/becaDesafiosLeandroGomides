package io.github.leandrogomides.nttMED.dto.responses;

import io.github.leandrogomides.nttMED.model.entities.Medico;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class MedicoResponse {
    private Long id;
    private String nome;
    private String tipoDeConsulta;
    private double preco;
//    private String mensagem;

    public MedicoResponse() {
    }

    public static MedicoResponse transformaEmDTO(Medico medico){
        return new MedicoResponse(medico.getId(), medico.getNome(), medico.getTipoDeConsulta(), medico.getPreco());
    }
}
