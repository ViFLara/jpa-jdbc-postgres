package com.alura.forum.service;

import com.alura.forum.dto.TopicDTO;
import com.alura.forum.entities.Topic;
import com.alura.forum.mapper.TopicMapper;
import com.alura.forum.repository.TopicRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;
    private final TopicMapper topicMapper = TopicMapper.INSTANCE;

  /*  public List<TopicDTO> listAll() {
        return topicRepository.findAll()
                .stream()
                .map(topicMapper::toDTO)
                .collect(Collectors.toList());
    }*/
}
