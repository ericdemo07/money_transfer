package com.payments.services.mappers;

import com.payments.jdbi.models.Transaction;
import com.payments.models.ImmutableTransactionModel;
import com.payments.models.TransactionModel;
import com.payments.services.enums.TransactionType;

public class TransactionsMapper {

    public TransactionModel buildTransactionResponse(Transaction transaction) {

        return ImmutableTransactionModel.builder()
                .id(transaction.id())
                .debitAccountId(transaction.debitAccountId())
                .creditAccountId(transaction.creditAccountId())
                .amount(transaction.amount())
                .transactionType(TransactionType.valueOf(transaction.transactionType()).get().name())
                .createdAt(transaction.createdAt())
                .build();
    }
}
