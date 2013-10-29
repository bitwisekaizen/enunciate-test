package com.thegrayfiles;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
public class Resource {

    @GET
    @Produces("application/json")
    public Response getRoot() {
        try {
            throwsTwoExceptions();
        } catch (IllegalAccessException | IllegalArgumentException e) {

        }
        return Response.ok(null).build();
    }

    private void throwsTwoExceptions() throws IllegalAccessException,IllegalArgumentException {
        return;
    }
}
