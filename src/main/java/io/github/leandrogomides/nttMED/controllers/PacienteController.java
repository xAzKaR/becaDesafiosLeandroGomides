package io.github.leandrogomides.nttMED.controllers;

import io.github.leandrogomides.nttMED.dto.requests.PacienteRequest;
import io.github.leandrogomides.nttMED.dto.responses.PacienteResponse;
<<<<<<< HEAD
import io.github.leandrogomides.nttMED.exception.PacienteNotFoundException;
=======
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
import io.github.leandrogomides.nttMED.model.entities.Paciente;
import io.github.leandrogomides.nttMED.model.repositories.PacienteRepository;
import io.github.leandrogomides.nttMED.model.services.PacienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/paciente")
public class PacienteController {


    private final PacienteRepository pacienteRepository;
    private final PacienteService pacienteService;

    @PostMapping
    public ResponseEntity<PacienteResponse> criar(@RequestBody PacienteRequest pacienteRequest) {
        PacienteResponse pacienteResponse = pacienteService.criar(pacienteRequest);

        return ResponseEntity.created(null).body(pacienteResponse);
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
        pacienteService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<PacienteResponse> atualizar(@RequestBody PacienteRequest pacienteRequest, @PathVariable Long id) {
        PacienteResponse atualizarPaciente = pacienteService.atualizar(pacienteRequest, id);

        return ResponseEntity.ok(atualizarPaciente);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PacienteResponse> obter(@PathVariable Long id) {
        PacienteResponse pacienteResponse = pacienteService.obter(id);

<<<<<<< HEAD
        if(pacienteResponse == null){
            throw new PacienteNotFoundException("Paciente com esse ID não foi encontrado" );
        }
=======
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
        return ResponseEntity.ok(pacienteResponse);
    }

    @GetMapping("/pagina/{numeroPagina}/{qtdePagina}")
    public ResponseEntity<Iterable<Paciente>> listarTodos(@PathVariable int numeroPagina, @PathVariable int qtdePagina) {
        Pageable page = PageRequest.of(numeroPagina, qtdePagina);

        return ResponseEntity.ok(pacienteRepository.findAll(page));
    }

    @GetMapping
    public ResponseEntity<List<PacienteResponse>> listar() {
        List<PacienteResponse> pacienteResponses = pacienteService.listar();
        return ResponseEntity.ok(pacienteResponses);
    }
}
