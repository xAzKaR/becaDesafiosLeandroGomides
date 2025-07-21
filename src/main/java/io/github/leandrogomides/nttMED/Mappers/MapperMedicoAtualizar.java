package io.github.leandrogomides.nttMED.Mappers;

import io.github.leandrogomides.nttMED.dto.requests.MedicoRequest;
import io.github.leandrogomides.nttMED.model.entities.Medico;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperMedicoAtualizar {
    public void atualizar(MedicoRequest medicoRequest, @MappingTarget Medico medico);
}
