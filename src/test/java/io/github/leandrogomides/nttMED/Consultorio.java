package becaDesafiosLeandroGomides.nttMED.src.test.java.io.github.leandrogomides.nttMED;

import java.util.ArrayList;
import java.util.List;

public class Consultorio {

    List<Consulta> consultas = new ArrayList<>();

    void adicionarConsulta(Medico m) {
        this.consultas.add(new Consulta(new Medico(m.nome, m.tipoDeConsulta, m.preco)));
    }

    void adicionarConsulta(String nome, String tipoDeConsulta, double preco) {
        var medico = new Medico(nome, tipoDeConsulta, preco);
        this.consultas.add(new Consulta(medico));
    }

    double getValorTotal() {
        double total = 0;

        for (Consulta consulta : consultas){
            total += consulta.medico.preco;
        }
        return total;
    }
}
