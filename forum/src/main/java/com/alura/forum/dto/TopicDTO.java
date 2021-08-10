package com.alura.forum.dto;

import com.alura.forum.entities.Answer;
import com.alura.forum.entities.Course;
import com.alura.forum.entities.User;
import com.alura.forum.enums.TopicStatus;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TopicDTO {

    private Long id;

    @NotNull
    @Size(min = 1, max = 100)
    private String title;

    @Column(nullable = false)
    private String message;

    @Column(nullable = false)
    private LocalDateTime createDate = LocalDateTime.now();

}
