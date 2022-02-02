package io.github.leandrogomides.nttMED.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class MedicoRequest {
    private String nome;
    private String tipoDeConsulta;
    private double preco;
//    private String mensagem;

//    public Medico transformaParaObjeto() {
//        return new Medico(this.nome, tipoDeConsulta, preco);
//    }
}
