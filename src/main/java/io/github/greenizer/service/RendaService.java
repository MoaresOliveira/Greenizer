package io.github.greenizer.service;

import io.github.greenizer.dto.RendaDTO;
import io.github.greenizer.entity.RendaEntity;
import io.github.greenizer.mapper.RendaMapper;
import io.github.greenizer.repository.RendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RendaService {

    @Autowired
    private RendaRepository repository;
    private final RendaMapper mapper = RendaMapper.INSTANCE;

    public RendaDTO createRenda(RendaDTO dto){
        RendaEntity entitySaved =  repository.save(mapper.dtoToEntity(dto));
        return mapper.entityToDTO(entitySaved);
    }

}
