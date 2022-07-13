package io.github.greenizer.service;

import io.github.greenizer.dto.RendaDTO;
import io.github.greenizer.entity.RendaEntity;
import io.github.greenizer.exception.NotFoundException;
import io.github.greenizer.mapper.RendaMapper;
import io.github.greenizer.repository.RendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RendaService {

    @Autowired
    private RendaRepository repository;
    private final RendaMapper mapper = RendaMapper.INSTANCE;

    public RendaDTO createRenda(RendaDTO dto){
        RendaEntity entitySaved =  repository.save(mapper.dtoToEntity(dto));
        return mapper.entityToDTO(entitySaved);
    }

    public RendaDTO updateRenda(RendaDTO dto, Integer id){
        Optional<RendaEntity> entityToSave = repository.findById(id);
        if(entityToSave.isPresent()){
            RendaEntity entity = mapper.dtoToEntity(dto);
            entity.setId(id);
            return mapper.entityToDTO(repository.save(entity));
        }else{
            RendaEntity rendaEntity = mapper.dtoToEntity(dto);
            return mapper.entityToDTO(repository.save(rendaEntity));
        }
    }

    public void deleteRenda(Integer id){
        Optional<RendaEntity> optionalRenda = repository.findById(id);
        if(optionalRenda.isPresent()){
            repository.delete(optionalRenda.get());
        }else{
            throw new NotFoundException("Renda com id " + id + " não encontrado");
        }
    }

    public List<RendaDTO> getAllRenda(){
        List<RendaEntity> rendas = repository.findAll();
        return rendas.stream().map(mapper::entityToDTO).collect(Collectors.toList());
    }

    public RendaDTO getRendaById(Integer id){
        Optional<RendaEntity> optionalRenda = repository.findById(id);
        if(optionalRenda.isPresent()){
            return mapper.entityToDTO(optionalRenda.get());
        }else{
            throw new NotFoundException("Renda com id " + id + " não encontrado");
        }
    }

}
