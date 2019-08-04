package com.payments.resources;

import com.payments.models.TransactionModel;
import com.payments.services.TransactionService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

@Path("/transactions")
@Produces(MediaType.APPLICATION_JSON)
public class TransactionsResource {

    @Inject
    private TransactionService transactionService;

    @GET
    @Path("{transactionUUID}")
    public TransactionModel getAccount(@PathParam("transactionUUID") UUID transactionId) throws Exception {
        TransactionModel transactionModel = transactionService.getTransaction(transactionId);

        return transactionModel;
    }
}
