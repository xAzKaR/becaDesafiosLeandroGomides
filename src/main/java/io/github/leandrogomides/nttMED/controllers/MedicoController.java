package io.github.leandrogomides.nttMED.controllers;

import io.github.leandrogomides.nttMED.model.entities.Medico;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @PostMapping
    public ResponseEntity<Medico> criar(@RequestBody Medico medico) {
        System.out.println(medico);

        Random geradorID = new Random(10);

        medico.setId(Math.abs(geradorID.nextLong()));

        System.out.println("Criou");

        return ResponseEntity.created(null).body(medico);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Medico> atualizar(@RequestBody Medico medico, @PathVariable Long id) {
        medico.setId(id);

        return ResponseEntity.ok(medico);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
//        "Deletou o Médico com o ID: " + id
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Medico>> listar() {
        Medico med1 = new Medico(1L, "João", "Ortopedia", 60.55);
        Medico med2 = new Medico(2L, "Maria", "Pediatria", 125.50);
        Medico med3 = new Medico(3L, "Pedro", "Papalelopistopista", 85.55);

        return ResponseEntity.ok(List.of(med1, med2, med3));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medico> obter(@PathVariable Long id) {
        Medico med1 = new Medico();
        med1.setId(id);
        med1.setNome("João");
        med1.setTipoDeConsulta("Ortopedia");
        med1.setPreco(155.5);

        return ResponseEntity.ok(med1);
    }

}

