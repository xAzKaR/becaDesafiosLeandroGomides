package io.github.leandrogomides.nttMED.controllers;

import io.github.leandrogomides.nttMED.model.entities.Medico;
import io.github.leandrogomides.nttMED.model.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;


    @PostMapping
    public ResponseEntity<Medico> criar(@RequestBody Medico medico) {
        Medico medicoCriado = medicoService.criar(medico);

        return ResponseEntity.created(null).body(medicoCriado);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Medico> atualizar(@RequestBody Medico medico, @PathVariable Long id) {
        Medico medicoAtualizar = medicoService.atualizar(medico, id);

        return ResponseEntity.ok(medicoAtualizar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
        medicoService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Medico>> listar() {
        List<Medico> ListaMedicos = medicoService.listar();

        return ResponseEntity.ok(ListaMedicos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medico> obter(@PathVariable Long id) {
        Medico obterMedico = medicoService.obter(id);

        return ResponseEntity.ok(obterMedico);
    }

}

