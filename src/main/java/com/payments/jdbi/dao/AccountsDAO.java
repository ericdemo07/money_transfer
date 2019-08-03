package com.payments.jdbi.dao;

import com.payments.jdbi.mapper.AccountMapper;
import com.payments.models.Account;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import ru.vyarus.guicey.jdbi3.installer.repository.JdbiRepository;
import ru.vyarus.guicey.jdbi3.tx.InTransaction;

import java.util.UUID;

@JdbiRepository
@InTransaction
@RegisterRowMapper(AccountMapper.class)
public interface AccountsDAO {
    @SqlQuery("SELECT CurrentBalance, AccountStatus FROM Accounts WHERE Id = :id")
    Account getAccountById(@Bind("id") UUID accountId);
}
