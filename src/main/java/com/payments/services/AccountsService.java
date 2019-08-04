package com.payments.services;

import com.payments.jdbi.dao.AccountsDAO;
import com.payments.jdbi.models.Account;
import com.payments.models.AccountModel;
import com.payments.services.enums.AccountStatus;
import com.payments.services.mappers.AccountsMapper;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.math.BigDecimal;
import java.util.UUID;

@Singleton
@Service
public class AccountsService {

    @Inject
    AccountsDAO accountsDAO;

    @Inject
    AccountsMapper accountsMapper;

    public AccountModel getAccount(UUID accountId) throws Exception {
        Account account = accountsDAO.getAccountById(accountId);
        AccountModel accountModel = accountsMapper.buildAccountResponse(account);
        return accountModel;
    }

    public UUID createAccount(AccountModel account) throws Exception {
        UUID uuid = UUID.randomUUID();

        boolean test = accountsDAO.createAccount(uuid,
                account.currentBalance().orElse(BigDecimal.valueOf(0.0)),
                AccountStatus.UNDER_SCRUTINY.name());

        return uuid;
    }

    public UUID changeStatus(UUID accountId, AccountStatus accountStatus) throws Exception {
        UUID uuid = UUID.randomUUID();

        boolean test = accountsDAO.changeStatus(accountStatus.name(), accountId);

        return uuid;
    }
}
