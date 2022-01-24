package becaDesafiosLeandroGomides.nttMED.src.test.java.io.github.leandrogomides.nttMED;

import io.github.leandrogomides.nttMED.model.entities.Consultorio;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

    final String nome;
    final List<Consultorio> consultorios = new ArrayList<>();

    Paciente(String nome) {
        this.nome = nome;
    }

    void adicionarConsulta(Consultorio consultorio) {
        this.consultorios.add(consultorio);
    }

    double getValorTotal() {
        double total = 0;

        for (Consultorio valorConsulta : consultorios) {
            total += valorConsulta.getValorTotal();
        }

        return total;
    }
}
