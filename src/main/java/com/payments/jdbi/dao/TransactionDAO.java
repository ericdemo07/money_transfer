package com.payments.jdbi.dao;

import com.payments.jdbi.mapper.TransactionMapper;
import com.payments.jdbi.models.Transaction;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import ru.vyarus.guicey.jdbi3.installer.repository.JdbiRepository;
import ru.vyarus.guicey.jdbi3.tx.InTransaction;

import java.math.BigDecimal;
import java.util.UUID;

@JdbiRepository
@InTransaction
@RegisterRowMapper(TransactionMapper.class)
public interface TransactionDAO {

    @SqlQuery("SELECT Id, DebitAccountId, CreditAccountId, Amount, TransactionType, CreatedAt FROM Transactions WHERE Id = :id")
    Transaction getTransactionById(@Bind("id") UUID accountId);

    @SqlUpdate("INSERT INTO Transactions( Id, DebitAccountId, CreditAccountId, Amount, TransactionType) " +
            "VALUES(:id, :DebitAccountId, :CreditAccountId, :Amount, :TransactionType)")
    boolean createTransaction(@Bind("id") UUID transactionId,
                              @Bind("DebitAccountId") UUID DebitAccountId,
                              @Bind("CreditAccountId") UUID CreditAccountId,
                              @Bind("Amount") BigDecimal Amount,
                              @Bind("TransactionType") String TransactionType);

}
