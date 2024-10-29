package ru.quipy.api

import ru.quipy.core.annotations.DomainEvent
import ru.quipy.domain.Event
import java.util.*

const val USER_AUTHENTICATED_EVENT = "USER_AUTHENTICATED_EVENT"
const val AUTHENTICATION_FAILED_EVENT = "AUTHENTICATION_FAILED_EVENT"
const val USER_REGISTERED_EVENT = "TAG_ASSIGNED_TO_TASK_EVENT"
const val REGISTRATION_FAILED_EVENT = "TASK_CREATED_EVENT"
const val PROJECT_ADDED_TO_USER_EVENT = "PROJECT_ADDED_TO_USER_EVENT"

@DomainEvent(name = USER_AUTHENTICATED_EVENT)
class UserAuthenticatedEvent(
        val usedId: UUID,
        createdAt: Long = System.currentTimeMillis(),
) : Event<UserAggregate>(
        name = USER_AUTHENTICATED_EVENT,
        createdAt = createdAt,
)

@DomainEvent(name = AUTHENTICATION_FAILED_EVENT)
class AuthenticationFailedEvent(
        val reason: String,
        createdAt: Long = System.currentTimeMillis(),
) : Event<UserAggregate>(
        name = AUTHENTICATION_FAILED_EVENT,
        createdAt = createdAt,
)

@DomainEvent(name = USER_REGISTERED_EVENT)
class UserRegisteredEvent(
        val email: String,
        val password: String,
        val username: String,
        createdAt: Long = System.currentTimeMillis(),
) : Event<UserAggregate>(
        name = USER_REGISTERED_EVENT,
        createdAt = createdAt,
)

@DomainEvent(name = REGISTRATION_FAILED_EVENT)
class RegistrationFailedEvent(
        val reason: String,
        createdAt: Long = System.currentTimeMillis(),
) : Event<UserAggregate>(
        name = REGISTRATION_FAILED_EVENT,
        createdAt = createdAt,
)

@DomainEvent(name = PROJECT_ADDED_TO_USER_EVENT)
class ProjectAddedToUserEvent(
        val usedId: UUID,
        val projectId: UUID,
        createdAt: Long = System.currentTimeMillis(),
) : Event<UserAggregate>(
        name = PROJECT_ADDED_TO_USER_EVENT,
        createdAt = createdAt,
)