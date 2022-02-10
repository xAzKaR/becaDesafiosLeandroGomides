package io.github.leandrogomides.nttMED.exception.handle;

import io.github.leandrogomides.nttMED.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

@ControllerAdvice
public class ExceptionHandle {


    @ExceptionHandler(MedicoNotFoundException.class)
    public ResponseEntity<DefaultException> handle(MedicoNotFoundException e) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem("Médico não encontrado");
        defaultException.setDataHora(LocalDateTime.now());
        defaultException.setStatus(HttpStatus.NOT_FOUND.value());

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(MedicoNotBeNullException.class)
    public ResponseEntity<DefaultException> handle(MedicoNotBeNullException e) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem("Campos de médico não podem ser nulos");
        defaultException.setDataHora(LocalDateTime.now());
        defaultException.setStatus(HttpStatus.NOT_ACCEPTABLE.value());

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<DefaultException> handle(NoSuchElementException e) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem("ID não existente!");
        defaultException.setDataHora(LocalDateTime.now());
        defaultException.setStatus(HttpStatus.NOT_FOUND.value());

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(PacienteNotBeNullException.class)
    public ResponseEntity<DefaultException> handle(PacienteNotBeNullException e) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem("O usuário não pode ser nulo!");
        defaultException.setDataHora(LocalDateTime.now());
        defaultException.setStatus(HttpStatus.NOT_ACCEPTABLE.value());

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(PacienteNotFoundException.class)
    public ResponseEntity<DefaultException> handle(PacienteNotFoundException e) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem("Paciente não foi encontrado");
        defaultException.setDataHora(LocalDateTime.now());
        defaultException.setStatus(HttpStatus.NOT_FOUND.value());

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(ConsultaNotFoundException.class)
    public ResponseEntity<DefaultException> handle(ConsultaNotFoundException e) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem("Paciente não foi encontrado");
        defaultException.setDataHora(LocalDateTime.now());
        defaultException.setStatus(HttpStatus.NOT_FOUND.value());

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(ConsultaNotBeNullException.class)
    public ResponseEntity<DefaultException> handle(ConsultaNotBeNullException e) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem("O usuário não pode ser nulo!");
        defaultException.setDataHora(LocalDateTime.now());
        defaultException.setStatus(HttpStatus.NOT_ACCEPTABLE.value());

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }


}

