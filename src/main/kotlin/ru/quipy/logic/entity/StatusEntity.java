package ru.quipy.logic.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class StatusEntity {
    private UUID id;
    private Long taskBoardId;
    private String name;
    private String hexColor;
    private LocalDateTime creationTime;
}
