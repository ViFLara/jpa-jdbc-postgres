package com.alura.forum.controller;

import com.alura.forum.dto.TopicDTO;
import com.alura.forum.entities.Course;
import com.alura.forum.entities.Topic;
import com.alura.forum.service.TopicService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/topics")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TopicController {

    private final TopicService topicService;

    @GetMapping
    public List<TopicDTO> listBeers() {
        return topicService.listAll();
    }
}
