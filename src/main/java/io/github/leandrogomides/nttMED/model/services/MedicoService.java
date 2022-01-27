package io.github.leandrogomides.nttMED.model.services;

import io.github.leandrogomides.nttMED.model.entities.Medico;
<<<<<<< HEAD
import java.util.List;


public interface MedicoService {

    public Medico criar(Medico medico);

    public Medico atualizar(Medico medicoAtualizado, Long id);

    public void deletar(Long id);

    public List<Medico> listar();

    public Medico obter(Long id);

=======
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class MedicoService {


    public Medico criar(Medico medico) {
        System.out.println(medico);

        Random geradorID = new Random(10);
        Medico med1 = new Medico(Math.abs(geradorID.nextLong()), "Joao", "Ortopedia", 155.99);

        System.out.println("Criou");

        return med1;
    }

    public Medico atualizar(Medico medico, Long id) {
        medico.setId(id);

        return medico;
    }

    public void deletar(Long id) {
//        medicoRepository.deleteById(id);
    }

    public List<Medico> listar() {
        Medico med1 = new Medico(1L, "João", "Ortopedia", 60.55);
        Medico med2 = new Medico(2L, "Maria", "Pediatria", 125.50);
        Medico med3 = new Medico(3L, "Pedro", "Papalelopistopista", 85.55);

        return List.of(med1, med2, med3);
    }

    public Medico obter(Long id) {
        Medico med1 = new Medico();
        med1.setId(id);
        med1.setNome("João");
        med1.setTipoDeConsulta("Ortopedia");
        med1.setPreco(155.5);

        return med1;
    }
>>>>>>> c833cf75a0e43343beffb8277fa70a1876ead681
}
