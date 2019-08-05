package com.payments.services.mappers;

import com.payments.models.ImmutableErrorModel;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Singleton;
import javax.ws.rs.core.Response;

@Service
@Singleton
public class CommonMapper {

    public Response buildErrorMapper(String error) {

        return Response.status(500)
                .entity(ImmutableErrorModel
                        .builder()
                        .error(error)
                        .build())
                .build();
    }
}
