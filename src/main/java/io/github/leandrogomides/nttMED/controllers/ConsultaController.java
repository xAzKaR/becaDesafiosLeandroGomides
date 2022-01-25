package io.github.leandrogomides.nttMED.controllers;

import io.github.leandrogomides.nttMED.model.entities.Consulta;
import io.github.leandrogomides.nttMED.model.entities.Medico;
import io.github.leandrogomides.nttMED.model.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @PostMapping
    public ResponseEntity<Consulta> criar(@RequestBody Consulta consulta) {
        Consulta criarConsulta = consultaService.criar(consulta);

        return ResponseEntity.created(null).body(criarConsulta);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable Long id) {
        consultaService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Consulta> atualizar(@RequestBody Consulta consulta, @PathVariable Long id) {
        Consulta consultaAtualizar = consultaService.atualizar(consulta, id);

        return ResponseEntity.ok(consultaAtualizar);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Consulta> obter(@PathVariable Long id) {
        Consulta obterConsulta = consultaService.obter(id);

        return ResponseEntity.ok(obterConsulta);
    }

    @GetMapping
    public ResponseEntity<List<Consulta>> listar() {
        List<Consulta> ListaConsultas = consultaService.listar();

        return ResponseEntity.ok(ListaConsultas);
    }

}
