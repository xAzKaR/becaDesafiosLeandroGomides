package io.github.leandrogomides.nttMED.controllers;

import io.github.leandrogomides.nttMED.model.entities.Paciente;
import io.github.leandrogomides.nttMED.model.repositories.PacienteRepository;
import io.github.leandrogomides.nttMED.model.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private PacienteService pacienteService;

    @PostMapping
    public ResponseEntity<Paciente> criar(@RequestBody Paciente paciente) {
        Paciente criarPaciente = pacienteService.criar(paciente);

        return ResponseEntity.created(null).body(pacienteRepository.save(criarPaciente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable Long id) {
        pacienteService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Paciente> atualizar(@RequestBody Paciente paciente, @PathVariable Long id) {
        Paciente atualizarPaciente = pacienteService.atualizar(paciente, id);

        return ResponseEntity.ok(pacienteRepository.save(atualizarPaciente));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> obter(@PathVariable Long id) {
        Optional<Paciente> obj = pacienteRepository.findById(id);

        return ResponseEntity.ok(obj.get());
    }

    @GetMapping("/pagina/{numeroPagina}/{qtdePagina}")
    public ResponseEntity<Iterable<Paciente>> listarTodos(@PathVariable int numeroPagina, @PathVariable int qtdePagina) {
        if (qtdePagina >= 3) qtdePagina = 3;
        Pageable page = PageRequest.of(numeroPagina, qtdePagina);

        return ResponseEntity.ok(pacienteRepository.findAll(page));
    }

    @GetMapping
    public ResponseEntity<Iterable<Paciente>> listar() {
        return ResponseEntity.ok(pacienteRepository.findAll());
    }
}
