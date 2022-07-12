package io.github.greenizer.mapper;

import io.github.greenizer.dto.RendaDTO;
import io.github.greenizer.entity.RendaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RendaMapper {

    RendaMapper INSTANCE = Mappers.getMapper(RendaMapper.class);

    RendaDTO entityToDTO(RendaEntity entity);

    RendaEntity dtoToEntity(RendaDTO entity);

}
