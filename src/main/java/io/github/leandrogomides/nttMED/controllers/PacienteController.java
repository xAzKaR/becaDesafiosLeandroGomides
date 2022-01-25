package io.github.leandrogomides.nttMED.controllers;

import io.github.leandrogomides.nttMED.model.entities.Paciente;
import io.github.leandrogomides.nttMED.model.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping
    public ResponseEntity<Paciente> criar(@RequestBody Paciente paciente) {
        Paciente criarPaciente = pacienteService.criar(paciente);

        return ResponseEntity.created(null).body(criarPaciente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable Long id) {
        pacienteService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Paciente> atualizar(@RequestBody Paciente paciente, @PathVariable Long id) {
        Paciente atualizarPaciente = pacienteService.atualizar(paciente, id);

        return ResponseEntity.ok(atualizarPaciente);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> obter(@PathVariable Long id) {
        Paciente obterPaciente = pacienteService.obter(id);

        return ResponseEntity.ok(obterPaciente);
    }

    @GetMapping
    public ResponseEntity<List<Paciente>> listar() {
        List<Paciente> listarPaciente = pacienteService.listar();
        return ResponseEntity.ok(listarPaciente);
    }
}
