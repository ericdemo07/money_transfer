package com.payments.services;

import com.payments.jdbi.dao.AccountsDAO;
import com.payments.jdbi.dao.TransactionDAO;
import com.payments.jdbi.models.Account;
import com.payments.jdbi.models.Transaction;
import com.payments.models.ImmutableTransactionModel;
import com.payments.models.TransactionModel;
import com.payments.services.enums.AccountStatus;
import com.payments.services.mappers.TransactionsMapper;
import io.reactivex.Single;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.WebApplicationException;
import java.util.List;
import java.util.UUID;

@Singleton
@Service
public class TransactionService {

    @Inject
    TransactionDAO transactionDAO;

    @Inject
    AccountsDAO accountsDAO;

    @Inject
    TransactionsMapper transactionsMapper;

    public Single<TransactionModel> getTransaction(UUID transactionId) throws Exception {

        return Single.just(transactionId)
                .map(id -> {
                    try {
                        Transaction transaction = transactionDAO.getTransactionById(transactionId);
                        return transactionsMapper.buildTransactionResponse(transaction);
                    } catch (Exception ex) {
                        throw new WebApplicationException("Transaction search failed");
                    }
                });
    }

    public Single<TransactionModel> transactAmount(TransactionModel transaction) throws WebApplicationException {

        List<Account> accounts = accountsDAO.getStatus(transaction.debitAccountId().get(), transaction.creditAccountId().get());

        isValid(accounts, transaction);

        return Single.just(UUID.randomUUID())
                .map(id -> {
                    try {
                        accountsDAO.debit(transaction.amount().get(), transaction.debitAccountId().get());
                        transactionDAO.createTransaction(id,
                                transaction.debitAccountId().get(),
                                transaction.creditAccountId().get(),
                                transaction.amount().get(),
                                transaction.transactionType().get());

                        return ImmutableTransactionModel.builder().id(id).build();
                    } catch (Exception ex) {
                        throw new WebApplicationException("Error Occoured");
                    }
                });
    }

    private void isValid(List<Account> accounts, TransactionModel transaction) throws WebApplicationException {

        for (Account account : accounts) {
            if (AccountStatus.valueOf(account.accountStatus()).get() != AccountStatus.ACTIVE) {
                if (transaction.creditAccountId().get().equals(account.id())) {
                    throw new WebApplicationException("Credit account is in " + AccountStatus.valueOf(account.accountStatus()).get() + " state");
                } else {
                    throw new WebApplicationException("Debit account is in " + AccountStatus.valueOf(account.accountStatus()).get() + " state");
                }
            }
            if (transaction.debitAccountId().get().equals(account.id()) && account.currentBalance().compareTo(transaction.amount().get()) == -1) {
                throw new WebApplicationException("Debit account does not have sufficient balance");
            }
        }
    }
}
