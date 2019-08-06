package com.payments.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.UUID;

@JsonDeserialize
@JsonInclude(value = JsonInclude.Include.NON_ABSENT, content = JsonInclude.Include.NON_EMPTY)
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
