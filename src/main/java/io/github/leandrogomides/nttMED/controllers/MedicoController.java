package io.github.leandrogomides.nttMED.controllers;

import io.github.leandrogomides.nttMED.model.entities.Medico;
import io.github.leandrogomides.nttMED.model.repositories.MedicoRepository;
import io.github.leandrogomides.nttMED.model.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private MedicoService medicoService;


    @PostMapping
    public ResponseEntity<Medico> criar(@RequestBody Medico medico) {
        Medico medicoCriado = medicoService.criar(medico);

        return ResponseEntity.created(null).body(medicoRepository.save(medicoCriado));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Medico> atualizar(@RequestBody Medico medico, @PathVariable Long id) {
        Medico medicoAtualizar = medicoRepository.save(medicoService.atualizar(medico, id));

        return ResponseEntity.ok(medicoAtualizar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
        medicoRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<Iterable<Medico>> listar() {

        return ResponseEntity.ok(medicoRepository.findAll());
    }


    @GetMapping("/pagina/{numeroPagina}/{qtdePagina}")
    public ResponseEntity<Iterable<Medico>> listarTodos(@PathVariable int numeroPagina, @PathVariable int qtdePagina) {
        if (qtdePagina >= 3) qtdePagina = 3;
        Pageable page = PageRequest.of(numeroPagina, qtdePagina);

        return ResponseEntity.ok(medicoRepository.findAll(page));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medico> obter(@PathVariable Long id) {
        Optional<Medico> obj = medicoRepository.findById(id);

        return ResponseEntity.ok(obj.get());
    }

}

