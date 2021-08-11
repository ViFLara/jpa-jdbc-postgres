package com.alura.forum.controller;

import com.alura.forum.dto.TopicDTO;
import com.alura.forum.entities.Course;
import com.alura.forum.entities.Topic;
import com.alura.forum.service.TopicService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/topics")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping
    public ResponseEntity<TopicDTO> findAll() {
        TopicDTO topicDTO = new TopicDTO(null, "Duvida", "Ajuda em API");
        return ResponseEntity.ok().body(topicDTO);
    }
}
