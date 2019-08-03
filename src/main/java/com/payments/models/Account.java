package com.payments.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.UUID;

//@Value.Immutable
@JsonDeserialize
public interface Account {
    @JsonProperty
    Optional<UUID> id();

    @JsonProperty
    double currentBalance();

    @JsonProperty
    int accountStatus();

    @JsonProperty
    Optional<OffsetDateTime> createdAt();
}
