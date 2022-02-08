package io.github.leandrogomides.nttMED.controllers;

import io.github.leandrogomides.nttMED.dto.requests.ConsultaRequest;
import io.github.leandrogomides.nttMED.dto.responses.ConsultaResponse;
import io.github.leandrogomides.nttMED.model.entities.Consulta;
import io.github.leandrogomides.nttMED.model.repositories.ConsultaRepository;
import io.github.leandrogomides.nttMED.model.services.ConsultaService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/consulta")
public class ConsultaController {

    private final ConsultaRepository consultaRepository;
    private final ConsultaService consultaService;

    @PostMapping
<<<<<<< HEAD
    public ResponseEntity<ConsultaResponse> criar(@RequestBody @Valid ConsultaRequest consultaRequest) {
=======
    public ResponseEntity<ConsultaResponse> criar(@RequestBody ConsultaRequest consultaRequest) {
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
        ConsultaResponse criarConsulta = consultaService.criar(consultaRequest);

        return ResponseEntity.created(null).body(criarConsulta);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationException(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();

            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        consultaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
<<<<<<< HEAD
    public ResponseEntity<ConsultaResponse> atualizar(@RequestBody @Valid ConsultaRequest consultaRequest, @PathVariable Long id) {
=======
    public ResponseEntity<ConsultaResponse> atualizar(@RequestBody ConsultaRequest consultaRequest, @PathVariable Long id) {
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
        ConsultaResponse consultaAtualizar = consultaService.atualizar(consultaRequest, id);

        return ResponseEntity.ok(consultaAtualizar);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConsultaResponse> obter(@PathVariable @Valid Long id) {
        ConsultaResponse consultaResponse = consultaService.obter(id);

        return ResponseEntity.ok(consultaResponse);
    }

    @GetMapping("/pagina/{numeroPagina}/{qtdePagina}")
    public ResponseEntity<Iterable<Consulta>> listarTodos(@PathVariable int numeroPagina, @PathVariable int qtdePagina) {

        if (qtdePagina >= 3) qtdePagina = 3;
        Pageable page = PageRequest.of(numeroPagina, qtdePagina);

        return ResponseEntity.ok(consultaRepository.findAll(page));
    }


    @GetMapping
    public ResponseEntity<List<ConsultaResponse>> listar() {
        List<ConsultaResponse> listaConsultas = consultaService.listar();

        return ResponseEntity.ok(listaConsultas);
    }

}
