package io.github.leandrogomides.nttMED.dto.responses;

<<<<<<< HEAD
import lombok.*;

@Data
=======
import io.github.leandrogomides.nttMED.model.entities.Paciente;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
public class PacienteResponse {
    private Long id;
    private String nome;
    private String telefone;
<<<<<<< HEAD
    private String status = "Paciente criado com sucesso! ";
=======
>>>>>>> b582fd10d12bda4d259a9ea43d474400a1a8a61a
}
