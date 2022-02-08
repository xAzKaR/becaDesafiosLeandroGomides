package io.github.leandrogomides.nttMED.exception.handle;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DefaultException {

    private int status;

    private String mensagem;

    private LocalDateTime dataHora;

}
