package io.github.leandrogomides.nttMED.model.repositories;

import io.github.leandrogomides.nttMED.model.entities.Medico;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface MedicoRepository extends PagingAndSortingRepository<Medico, Long> {
}
