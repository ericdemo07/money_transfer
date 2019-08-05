package com.payments.services;

import com.payments.jdbi.dao.AccountsDAO;
import com.payments.jdbi.models.Account;
import com.payments.models.AccountModel;
import com.payments.services.enums.AccountStatus;
import com.payments.services.mappers.AccountsMapper;
import io.reactivex.Single;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.WebApplicationException;
import java.math.BigDecimal;
import java.util.UUID;

@Singleton
@Service
public class AccountsService {

    @Inject
    AccountsDAO accountsDAO;

    @Inject
    AccountsMapper accountsMapper;

    public Single<AccountModel> getAccount(UUID accountId) throws Exception {

        return Single.just(accountId)
                .map(id -> {
                    try {
                        Account account = accountsDAO.getAccountById(id);
                        return accountsMapper.buildAccountResponse(account);
                    } catch (Exception ex) {
                        throw new WebApplicationException("Account search failed");
                    }
                });
    }

    public Single<UUID> createAccount(AccountModel account) throws Exception {

        final UUID uuid = UUID.randomUUID();

        return Single.just(accountsDAO.createAccount(uuid,
                account.currentBalance().orElse(BigDecimal.valueOf(0.0)),
                AccountStatus.UNDER_SCRUTINY.name()))
                .map(success -> {
                            if (!success) {
                                return uuid;
                            }
                            throw new WebApplicationException("Account creation failed");
                        }
                );
    }

    public Single<UUID> changeStatus(UUID accountId, AccountStatus accountStatus) throws Exception {

        return Single.just(accountId)
                .map(id -> {
                    try {
                        accountsDAO.changeStatus(accountStatus.name(), id);
                        return id;
                    } catch (Exception ex) {
                        throw new WebApplicationException("Account search failed");
                    }
                });
    }
}
