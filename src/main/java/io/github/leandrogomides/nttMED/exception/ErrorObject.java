package io.github.leandrogomides.nttMED.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ErrorObject {

    private int statusCode;

    private String message;

    private long timestamp;

}
