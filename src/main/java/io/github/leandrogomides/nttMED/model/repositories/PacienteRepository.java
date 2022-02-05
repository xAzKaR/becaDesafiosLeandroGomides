package io.github.leandrogomides.nttMED.model.repositories;

import io.github.leandrogomides.nttMED.model.entities.Paciente;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PacienteRepository extends PagingAndSortingRepository<Paciente, Long> {

}
