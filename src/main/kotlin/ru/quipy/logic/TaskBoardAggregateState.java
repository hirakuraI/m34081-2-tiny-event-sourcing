package ru.quipy.logic;

import kotlin.UninitializedPropertyAccessException;
import ru.quipy.api.TaskBoardAggregate;
import ru.quipy.domain.AggregateState;
import ru.quipy.logic.entity.StatusEntity;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

public class TaskBoardAggregateState implements AggregateState<UUID, TaskBoardAggregate> {
    private UUID id;
    private LinkedHashMap<StatusEntity, List<TaskEntity>> relatedTasksByStatus;

    @Override
    public UUID getId() {
        if (id == null) {
            throw new UninitializedPropertyAccessException("Property has not been initialized");
        }
        return id;

    }
}


