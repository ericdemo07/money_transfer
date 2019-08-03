package com.payments.jdbi.mapper;

import com.payments.models.Account;
import com.payments.models.ImmutableAccount;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountMapper implements RowMapper<Account> {
    @Override
    public Account map(ResultSet rs, StatementContext ctx) throws SQLException {

        return ImmutableAccount.builder()
                .currentBalance(rs.getDouble("CurrentBalance"))
                .accountStatus(rs.getInt("AccountStatus"))
                .build();
    }
}
