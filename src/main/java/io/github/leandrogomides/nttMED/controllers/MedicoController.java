package io.github.leandrogomides.nttMED.controllers;

import io.github.leandrogomides.nttMED.dto.requests.MedicoRequest;
import io.github.leandrogomides.nttMED.dto.responses.MedicoResponse;
import io.github.leandrogomides.nttMED.dto.responses.MedicoResponseAtualizar;
import io.github.leandrogomides.nttMED.dto.responses.MedicoResponseListar;
import io.github.leandrogomides.nttMED.model.entities.Medico;
import io.github.leandrogomides.nttMED.model.repositories.MedicoRepository;
import io.github.leandrogomides.nttMED.model.services.MedicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/medico")
public class MedicoController {


    private final MedicoRepository medicoRepository;
    private final MedicoService medicoService;

    @PostMapping
    public ResponseEntity<MedicoResponse> criar(@RequestBody MedicoRequest medicoRequest) {
        MedicoResponse medicoResponse = medicoService.criar(medicoRequest);

        return ResponseEntity.created(null).body(medicoResponse);
    }

//    @ExceptionHandler
//    public ResponseEntity<ErrorObject> handleException(MedicoNotFoundException ex) {
//        ErrorObject eObject = new ErrorObject(HttpStatus.NOT_FOUND.value(), ex.getMessage(), System.currentTimeMillis());
//
//        return new ResponseEntity<ErrorObject>(eObject, HttpStatus.NOT_FOUND);
//    }


    @PatchMapping("/{id}")
    public ResponseEntity<MedicoResponseAtualizar> atualizar(@RequestBody MedicoRequest medicoRequest, @PathVariable Long id) {
        MedicoResponseAtualizar medicoAtualizado = medicoService.atualizar(medicoRequest, id);

        return ResponseEntity.ok(medicoAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        medicoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<MedicoResponseListar>> listar() {
        List<MedicoResponseListar> listaMedicos = medicoService.listar();

        return ResponseEntity.ok(listaMedicos);
    }


    @GetMapping("/pagina/{numeroPagina}/{qtdePagina}")
    public ResponseEntity<Iterable<Medico>> listarTodos(@PathVariable int numeroPagina, @PathVariable int qtdePagina) {
        Pageable page = PageRequest.of(numeroPagina, qtdePagina);

        return ResponseEntity.ok(medicoRepository.findAll(page));
    }

    @GetMapping("/{id}")
    public ResponseEntity<MedicoResponse> obter(@PathVariable Long id) {
        MedicoResponse medicoResponse = medicoService.obter(id);

        return ResponseEntity.ok(medicoResponse);
    }

}

