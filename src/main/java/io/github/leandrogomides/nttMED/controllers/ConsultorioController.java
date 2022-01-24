package io.github.leandrogomides.nttMED.controllers;

import io.github.leandrogomides.nttMED.model.entities.Consulta;
import io.github.leandrogomides.nttMED.model.entities.Consultorio;
import io.github.leandrogomides.nttMED.model.entities.Medico;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultorio")
public class ConsultorioController {

    @PostMapping
    public ResponseEntity<Consultorio> criar(@RequestBody Consultorio consultorio) {
        consultorio.setId(1L);

        return ResponseEntity.created(null).body(consultorio);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Consultorio> atualizar(@RequestBody Consultorio consultorio, @PathVariable Long id) {
        consultorio.setId(id);

        return ResponseEntity.ok(consultorio);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Consultorio> obter(@PathVariable Long id) {
        Consultorio consulta1 = new Consultorio(new Consulta(new Medico(1L, "João", "Ortopedia", 155.99)));
        consulta1.setId(1L);

        return ResponseEntity.ok(consulta1);
    }

    @GetMapping
    public ResponseEntity<List<Consultorio>> listar(Consultorio consultorio) {
        Consultorio sala1 = new Consultorio(new Consulta(new Medico(1L, "João", "Ortopedia", 155.99)));
        sala1.setId(1L);

        Consultorio sala2 = new Consultorio(new Consulta(new Medico(2L, "Mateus", "Pediatria", 155.99)));
        sala2.setId(2L);

        Consultorio sala3 = new Consultorio(new Consulta(new Medico(3L, "Joana", "Pediatria", 99.55)));
        sala3.setId(3L);

        Consultorio sala4 = new Consultorio();
        sala4.setId(4L);
        sala4.adicionarConsulta(1L, "João", "Ortopedia", 155.99);

        return ResponseEntity.ok(List.of(sala1, sala2, sala3, sala4));
    }
}
