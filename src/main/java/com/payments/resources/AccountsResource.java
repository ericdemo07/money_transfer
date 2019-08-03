package com.payments.resources;

import com.payments.models.Account;
import com.payments.services.AccountsService;
import org.eclipse.jetty.http.HttpStatus;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.UUID;

@Path("/accounts")
@Produces(MediaType.APPLICATION_JSON)
public class AccountsResource {

    @Inject
    private AccountsService accountsService;

    @GET
    @Path("{accountUUID}")
    public Response getAccount(@PathParam("accountUUID") UUID accountId) throws Exception {
        System.out.println("\n\naccountId :" + accountId);
        Account account = accountsService.getAccount(accountId);
        if (account != null) {
            return Response.ok(account).build();
        }
        return Response.status(HttpStatus.BAD_REQUEST_400).entity(new WebApplicationException("Account not exist")).build();
    }
}
