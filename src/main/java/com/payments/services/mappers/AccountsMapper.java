package com.payments.services.mappers;

import com.payments.jdbi.models.Account;
import com.payments.models.AccountModel;
import com.payments.models.ImmutableAccountModel;
import com.payments.services.enums.AccountStatus;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Singleton;

@Service
@Singleton
public class AccountsMapper {

    public AccountModel buildAccountResponse(Account account) {

        return ImmutableAccountModel.builder()
                .id(account.id())
                .currentBalance(account.currentBalance())
                .accountStatus(AccountStatus.valueOf(account.accountStatus()).get().name())
                .createdAt(account.createdAt())
                .build();
    }
}
