package ru.quipy.api;

import ru.quipy.core.annotations.AggregateType;
import ru.quipy.domain.Aggregate;
@AggregateType(aggregateEventsTableName = "aggregate-task-board")
public class TaskBoardAggregate implements Aggregate {
}
