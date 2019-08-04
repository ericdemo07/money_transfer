package com.payments.jdbi.mapper;

import com.payments.jdbi.models.ImmutableTransaction;
import com.payments.jdbi.models.Transaction;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.OffsetDateTime;
import java.util.UUID;

public class TransactionMapper implements RowMapper<Transaction> {
    @Override
    public Transaction map(ResultSet rs, StatementContext ctx) throws SQLException {

        return ImmutableTransaction.builder()
                .id(rs.getObject("Id", UUID.class))
                .debitAccountId(rs.getObject("DebitAccountId", UUID.class))
                .creditAccountId(rs.getObject("CreditAccountId", UUID.class))
                .amount(rs.getBigDecimal("Amount"))
                .transactionType(rs.getInt("TransactionType"))
                .createdAt(rs.getObject("CreatedAt", OffsetDateTime.class))
                .build();
    }
}
