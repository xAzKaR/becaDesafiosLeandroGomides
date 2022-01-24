package io.github.leandrogomides.nttMED.controllers;

import io.github.leandrogomides.nttMED.model.entities.Paciente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @PostMapping
    public ResponseEntity<Paciente> criar(@RequestBody Paciente paciente) {
        System.out.println(paciente);
        paciente.setId(1L);

        return ResponseEntity.created(null).body(paciente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Paciente> atualizar(@RequestBody Paciente paciente, @PathVariable Long id) {
        paciente.setId(id);

        return ResponseEntity.ok(paciente);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> obter(@PathVariable Long id) {
        Paciente paciente1 = new Paciente(1L, "João");

        return ResponseEntity.ok(paciente1);
    }

    @GetMapping
    public ResponseEntity<List<Paciente>> listar() {
        Paciente paciente1 = new Paciente(1L, "Matheus");
        Paciente paciente2 = new Paciente(2L, "Erick");
        Paciente paciente3 = new Paciente(3L, "Joana");

        return ResponseEntity.ok(List.of(paciente1, paciente2, paciente3));
    }
}
