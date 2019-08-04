package com.payments.jdbi.models;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

//@Value.Immutable
public interface Account {
    UUID id();

    BigDecimal currentBalance();

    int accountStatus();

    OffsetDateTime createdAt();
}
