package io.github.leandrogomides.nttMED.controllers;

import io.github.leandrogomides.nttMED.model.entities.Consulta;
import io.github.leandrogomides.nttMED.model.entities.Medico;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {

    @PostMapping
    public ResponseEntity<Consulta> criar(@RequestBody Consulta consulta) {
        consulta.setId(1L);

        return ResponseEntity.created(null).body(consulta);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Consulta> atualizar(@RequestBody Consulta consulta, @PathVariable Long id) {
        consulta.setId(id);

        return ResponseEntity.ok(consulta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Consulta> obter(@PathVariable Long id) {
        Consulta consulta = new Consulta(new Medico(1L, "João", "Ortopedia", 155));
        consulta.setId(1L);

        Medico medico1 = new Medico(2L, "João", "Ortopedia", 155.99);
        Consulta consulta2 = new Consulta(2L, medico1);
        consulta2.setId(2L);

        return ResponseEntity.ok(consulta2);
    }

    @GetMapping
    public ResponseEntity<List<Consulta>> listar() {
        Consulta consulta1 = new Consulta(new Medico(1L, "Jorge", "Ortopedia", 155.99));
        consulta1.setId(1L);

        Consulta consulta2 = new Consulta(new Medico(2L, "Amanda", "Pediatria", 122.51));
        consulta2.setId(2L);


        Consulta consulta3 = new Consulta(new Medico(3L, "Joana", "Quiropraxia", 88.55));
        consulta3.setId(3L);

        Medico medico = new Medico(1L, "João", "Ortopedia", 155.99);
        Consulta consulta4 = new Consulta(medico);

        return ResponseEntity.ok(List.of(consulta1, consulta2, consulta3, consulta4));
    }

}
