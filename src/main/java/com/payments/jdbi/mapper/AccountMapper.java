package com.payments.jdbi.mapper;

import com.payments.jdbi.models.Account;
import com.payments.jdbi.models.ImmutableAccount;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.OffsetDateTime;
import java.util.UUID;

public class AccountMapper implements RowMapper<Account> {
    @Override
    public Account map(ResultSet rs, StatementContext ctx) throws SQLException {

        return ImmutableAccount.builder()
                .id(rs.getObject("Id", UUID.class))
                .currentBalance(rs.getBigDecimal("CurrentBalance"))
                .accountStatus(rs.getInt("AccountStatus"))
                .createdAt(rs.getObject("CreatedAt", OffsetDateTime.class))
                .build();
    }
}
