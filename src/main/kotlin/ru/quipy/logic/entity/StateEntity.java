package ru.quipy.logic.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
@Getter
@AllArgsConstructor
public class StateEntity {
    private String name;
    private LocalDateTime lastUpdateTime;
}
