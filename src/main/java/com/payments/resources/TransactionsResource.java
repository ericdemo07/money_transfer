package com.payments.resources;

import com.payments.models.ImmutableTransactionModel;
import com.payments.services.TransactionService;
import com.payments.services.mappers.CommonMapper;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

@Path("/transactions")
@Produces(MediaType.APPLICATION_JSON)
public class TransactionsResource {

    @Inject
    private TransactionService transactionService;

    @Inject
    private CommonMapper commonMapper;

    @GET
    @Path("{transactionUUID}")
    public void getAccount(@PathParam("transactionUUID") UUID transactionId,
                           @Suspended final AsyncResponse asyncResponse) throws Exception {

        transactionService.getTransaction(transactionId)
                .subscribe(res -> asyncResponse.resume(res),
                        inError -> asyncResponse.resume(commonMapper.buildErrorMapper(inError.getMessage())));
    }

    @POST
    @Path("transact")
    public void transferAmount(ImmutableTransactionModel transaction,
                               @Suspended final AsyncResponse asyncResponse) throws Exception {

        transactionService.transactAmount(transaction)
                .subscribe(res -> asyncResponse.resume(res),
                        inError -> asyncResponse.resume(commonMapper.buildErrorMapper(inError.getMessage())));
    }
}
