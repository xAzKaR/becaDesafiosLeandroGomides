package io.github.leandrogomides.nttMED.domains;

import java.util.ArrayList;
import java.util.List;

public class Consultorio {


    private Long id;
    List<Consulta> consultas = new ArrayList<>();

    public Consultorio(){
    }

    public Consultorio(Consulta consulta) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void adicionarConsulta(Medico medico) {
        this.consultas.add(new Consulta(new Medico(medico.getId(), medico.getNome(), medico.getTipoDeConsulta(), medico.getPreco())));
    }

    public void adicionarConsulta(Long id, String nome, String tipoDeConsulta, double preco) {
        var medico = new Medico(id, nome, tipoDeConsulta, preco);
        this.consultas.add(new Consulta(medico));
    }

    double getValorTotal() {
        double total = 0;

        for (Consulta consulta : consultas) {
            total += consulta.getMedico().getPreco();
        }
        return total;
    }

}
