package io.github.leandrogomides.nttMED.model.repositories;

import io.github.leandrogomides.nttMED.model.entities.Paciente;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends PagingAndSortingRepository<Paciente, Long> {
}
