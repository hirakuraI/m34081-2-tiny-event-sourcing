package ru.quipy.logic;

import kotlin.UninitializedPropertyAccessException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.quipy.api.UserAggregate;
import ru.quipy.domain.AggregateState;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class UserAggregateState implements AggregateState<UUID, UserAggregate> {
    private UUID id;
    private String username;
    private String password;
    private String fio;

    @Override
    public UUID getId() {
        if (id == null) {
            throw new UninitializedPropertyAccessException("Property has not been initialized");
        }
        return id;
    }
}
