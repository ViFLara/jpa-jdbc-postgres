package com.alura.forum.mapper;

import com.alura.forum.dto.TopicDTO;
import com.alura.forum.entities.Topic;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TopicMapper {

    TopicMapper INSTANCE = Mappers.getMapper(TopicMapper.class);

    Topic toModel(TopicDTO topicDTO);

    TopicDTO toDTO(Topic topic);
}
