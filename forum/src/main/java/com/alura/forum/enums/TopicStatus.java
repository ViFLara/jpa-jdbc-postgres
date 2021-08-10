package com.alura.forum.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TopicStatus {

    NOT_ANSWERED,
    NOT_SOLVED,
    SOLVED,
    CLOSED;
}
