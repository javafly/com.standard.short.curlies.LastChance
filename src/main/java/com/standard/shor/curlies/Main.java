/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.standard.shor.curlies;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.core.Application;

/**
 *
 * @author sbowen
 */
@ApplicationPath("/foo/")
@Path("/")
public class Main extends Application {
    
    @GET
    @Path("/bar/{name}")
    public String someMethod(@PathParam("name") String name) {
        return "Hello " + name;
    }
    
    @POST
    @Path("/lol")
    public String someThing(@FormParam("url") String message) {
        Integer count = message.length();
        return "Message length: " + count.toString();
    }
}
