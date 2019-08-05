package com.payments.jdbi.dao;

import com.payments.jdbi.mapper.AccountMapper;
import com.payments.jdbi.models.Account;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import ru.vyarus.guicey.jdbi3.installer.repository.JdbiRepository;
import ru.vyarus.guicey.jdbi3.tx.InTransaction;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@JdbiRepository
@InTransaction
@RegisterRowMapper(AccountMapper.class)
public interface AccountsDAO {
    @SqlQuery("SELECT Id, CurrentBalance, AccountStatus, CreatedAt FROM Accounts WHERE Id = :id")
    Account getAccountById(@Bind("id") UUID accountId);

    @SqlUpdate("INSERT INTO Accounts(Id, CurrentBalance, AccountStatus) " +
            "VALUES(:id, :CurrentBalance, :AccountStatus)")
    boolean createAccount(@Bind("id") UUID accountId,
                          @Bind("CurrentBalance") BigDecimal currentBalance,
                          @Bind("AccountStatus") String accountStatus);

    @SqlUpdate("UPDATE Accounts SET AccountStatus = :AccountStatus WHERE Id = :id")
    boolean changeStatus(@Bind("AccountStatus") String accountStatus, @Bind("id") UUID accountId);

    @SqlQuery("SELECT Id, CurrentBalance, AccountStatus, CreatedAt FROM Accounts WHERE Id IN (:debitAccountId, :creditAccountId)")
    List<Account> getStatus(@Bind("debitAccountId") UUID debitAccountId, @Bind("creditAccountId") UUID creditAccountId);

    @SqlUpdate("UPDATE Accounts SET CurrentBalance = CurrentBalance - :Amount WHERE Id = :id")
    boolean debit(@Bind("Amount") BigDecimal amount, @Bind("id") UUID accountId);
}
