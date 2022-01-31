//package io.github.leandrogomides.nttMED.model.servicesImplements;
//
//import io.github.leandrogomides.nttMED.model.entities.Consultorio;
//import io.github.leandrogomides.nttMED.model.services.ConsultorioService;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class ConsultorioImplements implements ConsultorioService {
//
//    List<Consultorio> listaConsultorio = new ArrayList<>();
//    Long id = 0L;
//
//    @Override
//    public Consultorio criar(Consultorio consultorio) {
////        listaConsultorio.add(new Consultorio(++id, consultorio.getMedico()));
//        listaConsultorio.add(new Consultorio(++id, consultorio.getData(), consultorio.getConsultas()));
//
//        return consultorio;
//    }
//
//    @Override
//    public void deletar(Long id) {
//        for (int i = 0; i < listaConsultorio.size(); i++) {
//            if (listaConsultorio.get(i).getId() == id) {
//                listaConsultorio.remove(i);
//            }
//        }
//
//    }
//
//    @Override
//    public Consultorio atualizar(Consultorio consultorioAtualizado, Long id) {
//        Consultorio consultorio = null;
//
//        for (int i = 0; i < listaConsultorio.size(); i++) {
//            if (listaConsultorio.get(i).getId() == id) {
//                consultorio = listaConsultorio.set(i, consultorioAtualizado);
//            }
//        }
//
//        return consultorio;
//    }
//
//    @Override
//    public Consultorio obter(Long id) {
//        Consultorio consultorio = null;
//
//        for (int i = 0; i < listaConsultorio.size(); i++) {
//            if (listaConsultorio.get(i).getId() == id) {
//                consultorio = listaConsultorio.get(i);
//            }
//
//        }
//        return consultorio;
//    }
//
//    @Override
//    public List<Consultorio> listar() {
//
//        for (Consultorio consultorios : listaConsultorio) {
//            System.out.println(consultorios);
//
//        }
//
//        return listaConsultorio;
//    }
//}
