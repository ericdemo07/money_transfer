package com.payments.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.UUID;

//@Value.Immutable
@JsonDeserialize
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface TransactionModel {

    @JsonProperty
    Optional<UUID> id();

    @JsonProperty
    Optional<UUID> debitAccountId();

    @JsonProperty
    Optional<UUID> creditAccountId();

    @JsonProperty
    Optional<BigDecimal> amount();

    @JsonProperty
    Optional<String> transactionType();

    @JsonProperty
    Optional<OffsetDateTime> createdAt();
}
