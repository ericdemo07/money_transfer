package com.payments.jdbi.dao;

import com.payments.jdbi.mapper.TransactionMapper;
import com.payments.jdbi.models.Transaction;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import ru.vyarus.guicey.jdbi3.installer.repository.JdbiRepository;
import ru.vyarus.guicey.jdbi3.tx.InTransaction;

import java.util.UUID;

@JdbiRepository
@InTransaction
@RegisterRowMapper(TransactionMapper.class)
public interface TransactionDAO {

    @SqlQuery("SELECT Id, DebitAccountId, CreditAccountId, Amount, TransactionType, CreatedAt FROM Transactions WHERE Id = :id")
    Transaction getTransactionById(@Bind("id") UUID accountId);

}
