package com.payments.services;

import com.payments.jdbi.dao.TransactionDAO;
import com.payments.jdbi.models.Transaction;
import com.payments.models.TransactionModel;
import com.payments.services.mappers.TransactionsMapper;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.UUID;

@Singleton
@Service
public class TransactionService {

    @Inject
    TransactionDAO transactionDAO;

    @Inject
    TransactionsMapper transactionsMapper;

    public TransactionModel getTransaction(UUID transactionId) throws Exception {
        Transaction transaction = transactionDAO.getTransactionById(transactionId);
        TransactionModel transactionModel = transactionsMapper.buildTransactionResponse(transaction);
        return transactionModel;
    }
}
