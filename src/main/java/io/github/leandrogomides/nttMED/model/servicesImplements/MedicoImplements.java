package io.github.leandrogomides.nttMED.model.servicesImplements;

import io.github.leandrogomides.nttMED.model.entities.Medico;
import io.github.leandrogomides.nttMED.model.services.MedicoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedicoImplements implements MedicoService {

    List<Medico> listaMedico = new ArrayList<>();
    Long id = 0L;

    @Override
    public Medico criar(Medico medico) {
        listaMedico.add(new Medico(++id, medico.getNome(), medico.getTipoDeConsulta(), medico.getPreco()));

        return medico;
    }

    @Override
    public Medico atualizar(Medico medicoAtualizado, Long id) {
        Medico medico = null;

        for (int i = 0; i < listaMedico.size(); i++) {

            if (listaMedico.get(i).getId() == id) {
//                medico = listaMedico.get(i);
                medico = listaMedico.set(i, medicoAtualizado);
            }

        }

        return medico;
    }

    @Override
    public void deletar(Long id) {
        for (int i = 0; i < listaMedico.size(); i++) {
            if(listaMedico.get(i).getId() == id){
                listaMedico.remove(i);
            }
        }
    }

//    @Override
//    public Iterable<Medico> listarTodos(int numeroPagina, int qtdePagina) {
//
//        for (int i = 0; i < listaMedico.size(); i++) {
//            if(listaMedico.size() >= 3 ){
//                listaMedico.remove(i);
//            }
//        }
//
//        return null;
//    }

    @Override
    public List<Medico> listar() {

        for (Medico medicos : listaMedico) {
            System.out.println(medicos);
        }

        return listaMedico;
    }

    @Override
    public Medico obter(Long id) {

        Medico medico = null;

        for (int i = 0; i < listaMedico.size(); i++) {
            if (listaMedico.get(i).getId() == id) {
                medico = listaMedico.get(i);
            }
        }

        return medico;
    }
}
