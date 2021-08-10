package com.alura.forum.repository;

import com.alura.forum.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TopicRepository extends JpaRepository<Topic, Long> {
        Optional<Topic> findByName(String name);
}
