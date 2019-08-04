package com.payments.jdbi.models;


import org.immutables.value.Value;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

//@Value.Immutable
public interface Transaction {

    UUID id();

    UUID debitAccountId();

    UUID creditAccountId();

    BigDecimal amount();

    int transactionType();

    OffsetDateTime createdAt();
}
