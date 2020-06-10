package com.servisler;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/servis")
public class MyResource {


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "/pathParam/{deger}\n/queryParam?ad=isim&soyad=soyisim";
    }
    
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/pathParam/{deger}")
    public Response metot(@PathParam("deger")String deger) 
    {
    	System.out.println(deger);
		return Response.status(200).entity(deger).build();
	}
    
    @GET
    @Produces(MediaType.TEXT_PLAIN+";charset=UTF-8")
    @Path("/queryParam")
    public Response metot2(@QueryParam("ad")String ad,@QueryParam("soyad")String soyad) 
    {
    	System.out.println("Ad : "+ad+"\nSoyad : "+soyad);
    	
		return Response.status(200).entity("Ad : "+ad+"\nSoyad : "+soyad).build();
	}
}
