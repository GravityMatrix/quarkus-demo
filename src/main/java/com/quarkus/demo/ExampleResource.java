package com.quarkus.demo;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/v1")
public class ExampleResource {

    @Inject
    Instance<Say> say;

    @Path("/hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("say")
    public void say() {
        for (Say say1 : say) {
            say1.say();
        }
    }
}