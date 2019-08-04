package com.payments.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.UUID;

//@Value.Immutable
@JsonDeserialize
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface AccountModel {
    @JsonProperty
    Optional<UUID> id();

    @JsonProperty
    Optional<BigDecimal> currentBalance();

    @JsonProperty
    Optional<String> accountStatus();

    @JsonProperty
    Optional<OffsetDateTime> createdAt();
}
