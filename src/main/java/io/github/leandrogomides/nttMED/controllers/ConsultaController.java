package io.github.leandrogomides.nttMED.controllers;

import io.github.leandrogomides.nttMED.model.entities.Consulta;
import io.github.leandrogomides.nttMED.model.repositories.ConsultaRepository;
import io.github.leandrogomides.nttMED.model.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {

    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    private ConsultaService consultaService;

    @PostMapping
    public ResponseEntity<Consulta> criar(@RequestBody Consulta consulta) {
        Consulta criarConsulta = consultaService.criar(consulta);

        return ResponseEntity.created(null).body(consultaRepository.save(criarConsulta));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable Long id) {
        consultaRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Consulta> atualizar(@RequestBody Consulta consulta, @PathVariable Long id) {
        Consulta consultaAtualizar = consultaService.atualizar(consulta, id);

        return ResponseEntity.ok(consultaRepository.save(consultaAtualizar));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Consulta> obter(@PathVariable Long id) {
        Optional<Consulta> obj = consultaRepository.findById(id);

        return ResponseEntity.ok(obj.get());
    }

    @GetMapping("/pagina/{numeroPagina}/{qtdePagina}")
    public ResponseEntity<Iterable<Consulta>> listarTodos(@PathVariable int numeroPagina, @PathVariable int qtdePagina) {

        if (qtdePagina >= 3) qtdePagina = 3;
        Pageable page = PageRequest.of(numeroPagina, qtdePagina);

        return ResponseEntity.ok(consultaRepository.findAll(page));
    }


    @GetMapping
    public ResponseEntity<Iterable<Consulta>> listar() {

        return ResponseEntity.ok(consultaRepository.findAll());
    }

}
