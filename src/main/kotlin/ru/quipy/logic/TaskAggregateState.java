package ru.quipy.logic;

import kotlin.UninitializedPropertyAccessException;
import ru.quipy.api.TaskAggregate;
import ru.quipy.domain.AggregateState;
import ru.quipy.logic.entity.StateEntity;

import java.util.UUID;

public class TaskAggregateState implements AggregateState<UUID, TaskAggregate> {
    private UUID id;
    private String title;
    private StateEntity state;

    @Override
    public UUID getId() {
        if (id == null) {
            throw new UninitializedPropertyAccessException("Property has not been initialized");
        }
        return id;
    }
}