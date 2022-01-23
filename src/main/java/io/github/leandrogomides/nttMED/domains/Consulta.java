package io.github.leandrogomides.nttMED.domains;

public class Consulta {

    private Long id;
    private Medico medico;


    public void setId(Long id) {
        this.id = id;
    }

    public Medico getMedico() {
        return medico;
    }

    public Long getId() {
        return id;
    }

    public Consulta(){
    }

    public Consulta(Medico medico) {
        this.medico = medico;
    }

    public Consulta(Long id, Medico medico) {
        this.id = id;
        this.medico = medico;
    }

}
