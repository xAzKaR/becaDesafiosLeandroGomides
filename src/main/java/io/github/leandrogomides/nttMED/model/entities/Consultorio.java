//package io.github.leandrogomides.nttMED.model.entities;
//
//import java.time.LocalDate;
//import java.util.List;
//
//public class Consultorio {
//
//
//    private Long id;
//
//    private LocalDate data;
//    List<Consulta> consultas;
//
////    @ManyToOne
////    @JoinColumn(name = "medico_id")
////    private Medico medico;
//
//
//    public Consultorio() {
//    }
//
////    public Consultorio(Long aLong, Medico medico) {
////    }
//
////    public Consultorio(Consulta consulta) {
////    }
//
//    public LocalDate getData() {
//        return data = LocalDate.now();
//    }
//
//    public List<Consulta> getConsultas() {
//        return consultas;
//    }
//
//    public void setConsultas(List<Consulta> consultas) {
//        this.consultas = consultas;
//    }
//
//    public void setData(LocalDate data) {
//        this.data = data;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void adicionarConsulta(Medico medico) {
//        this.consultas.add(new Consulta(new Medico(medico.getId(), medico.getNome(), medico.getTipoDeConsulta(), medico.getPreco())));
//    }
//
////    public Consulta getConsulta() {
////        return consulta;
////    }
////
////    public void setConsulta(Consulta consulta) {
////        this.consulta = consulta;
////    }
//
//    public Consultorio(Long id, LocalDate data, List<Consulta> consultas) {
//        this.id = id;
//        this.data = data;
//        this.consultas = consultas;
//    }
//
////    public Medico getMedico() {
////        return medico;
////    }
////
////    public void setMedico(Medico medico) {
////        this.medico = medico;
////    }
//
//    public void adicionarConsulta(Long id, String nome, String tipoDeConsulta, double preco) {
//        var medico = new Medico(id, nome, tipoDeConsulta, preco);
//        this.consultas.add(new Consulta(medico));
//    }
//
//    public double getValorTotal() {
//        double total = 0;
//
//        for (Consulta consulta : consultas) {
//            total += consulta.getMedico().getPreco();
//        }
//        return total;
//    }
//
//}
