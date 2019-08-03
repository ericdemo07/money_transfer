package com.payments.resources;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
public class MainResource {
    @GET
    @Timed
    public String sayHello(@QueryParam("name") String name) {
        final String value = name;
        return value;
    }
}
