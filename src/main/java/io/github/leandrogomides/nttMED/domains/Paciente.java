package io.github.leandrogomides.nttMED.domains;

//import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Paciente {

    private Long id;
    final String nome;
    final List<Consultorio> consultorios = new ArrayList<>();

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Paciente(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void adicionarConsulta(Consultorio consultorio) {
        this.consultorios.add(consultorio);
    }

    public double getValorTotal() {
        double total = 0;

        for (Consultorio valorConsulta : consultorios) {
            total += valorConsulta.getValorTotal();
        }

        return total;
    }
}
