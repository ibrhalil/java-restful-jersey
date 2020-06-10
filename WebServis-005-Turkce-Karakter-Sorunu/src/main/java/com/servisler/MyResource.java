package com.servisler;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("servis1")
public class MyResource {


    @GET
    @Produces(MediaType.TEXT_PLAIN+";charset=UTF-8")
    public String getIt() {
        return "Türkçe Karakter Sorunu Çok Sıkıcı...";
    }
}
