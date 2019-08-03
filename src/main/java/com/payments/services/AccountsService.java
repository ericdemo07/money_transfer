package com.payments.services;

import com.payments.jdbi.dao.AccountsDAO;
import com.payments.models.Account;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.UUID;

@Singleton
@Service
public class AccountsService {

    @Inject
    AccountsDAO accountsDAO;

    public Account getAccount(UUID accountId) throws Exception {
        Account account = accountsDAO.getAccountById(accountId);
        return account;
    }
}
