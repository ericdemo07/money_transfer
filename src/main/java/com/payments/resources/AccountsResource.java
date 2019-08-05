package com.payments.resources;

import com.payments.models.ImmutableAccountModel;
import com.payments.services.AccountsService;
import com.payments.services.enums.AccountStatus;
import com.payments.services.mappers.CommonMapper;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

@Path("/accounts")
@Produces(MediaType.APPLICATION_JSON)
public class AccountsResource {

    @Inject
    private AccountsService accountsService;

    @Inject
    private CommonMapper commonMapper;

    @GET
    @Path("{accountUUID}")
    public void getAccount(@PathParam("accountUUID") UUID accountId,
                           @Suspended final AsyncResponse asyncResponse) throws Exception {

        accountsService.getAccount(accountId)
                .subscribe(res -> asyncResponse.resume(res),
                        inError -> asyncResponse.resume(commonMapper.buildErrorMapper(inError.getMessage())));
    }

    @POST
    public void createAccount(ImmutableAccountModel account,
                              @Suspended final AsyncResponse asyncResponse) throws Exception {

        accountsService.createAccount(account)
                .subscribe(res -> asyncResponse.resume(ImmutableAccountModel.builder().id(res).build()),
                        inError -> asyncResponse.resume(commonMapper.buildErrorMapper(inError.getMessage())));
    }


    @PUT
    @Path("{accountUUID}/deactivate")
    public void deactivate(@PathParam("accountUUID") UUID accountId,
                           @Suspended final AsyncResponse asyncResponse) throws Exception {

        accountsService.changeStatus(accountId, AccountStatus.DEACTIVE)
                .subscribe(res -> asyncResponse.resume(ImmutableAccountModel.builder()
                                .id(res)
                                .accountStatus(AccountStatus.DEACTIVE.name())
                                .build()),
                        inError -> asyncResponse.resume(commonMapper.buildErrorMapper(inError.getMessage())));
    }

    @PUT
    @Path("{accountUUID}/approve")
    public void approve(@PathParam("accountUUID") UUID accountId,
                        @Suspended final AsyncResponse asyncResponse) throws Exception {

        accountsService.changeStatus(accountId, AccountStatus.ACTIVE)
                .subscribe(res -> asyncResponse.resume(ImmutableAccountModel.builder()
                                .id(res)
                                .accountStatus(AccountStatus.ACTIVE.name())
                                .build()),
                        inError -> asyncResponse.resume(commonMapper.buildErrorMapper(inError.getMessage())));
    }
}
