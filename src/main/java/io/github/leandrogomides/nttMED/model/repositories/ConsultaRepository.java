package io.github.leandrogomides.nttMED.model.repositories;

import io.github.leandrogomides.nttMED.model.entities.Consulta;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends PagingAndSortingRepository<Consulta, Long> {
}
