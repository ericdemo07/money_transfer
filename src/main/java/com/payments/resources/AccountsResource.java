package com.payments.resources;

import com.payments.models.AccountModel;
import com.payments.models.ImmutableAccountModel;
import com.payments.services.AccountsService;
import com.payments.services.enums.AccountStatus;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

@Path("/accounts")
@Produces(MediaType.APPLICATION_JSON)
public class AccountsResource {

    @Inject
    private AccountsService accountsService;

    @GET
    @Path("{accountUUID}")
    public AccountModel getAccount(@PathParam("accountUUID") UUID accountId) throws Exception {
        AccountModel account = accountsService.getAccount(accountId);
        return account;
    }

    @POST
    public AccountModel createAccount(ImmutableAccountModel account) throws Exception {
        UUID uuid = accountsService.createAccount(account);
        return ImmutableAccountModel.builder()
                .id(uuid).build();
    }


    @PUT
    @Path("{accountUUID}/deactivate")
    public AccountModel deactivate(@PathParam("accountUUID") UUID accountId) throws Exception {
        UUID uuid = accountsService.changeStatus(accountId, AccountStatus.DEACTIVE);

        return ImmutableAccountModel.builder()
                .accountStatus(AccountStatus.DEACTIVE.name()).build();
    }

    @PUT
    @Path("{accountUUID}/approve")
    public AccountModel approve(@PathParam("accountUUID") UUID accountId) throws Exception {
        UUID uuid = accountsService.changeStatus(accountId, AccountStatus.ACTIVE);

        return ImmutableAccountModel.builder()
                .accountStatus(AccountStatus.ACTIVE.name()).build();
    }
}
