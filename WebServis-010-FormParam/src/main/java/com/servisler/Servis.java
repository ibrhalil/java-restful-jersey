package com.servisler;

import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/formparam")
public class Servis {
	
	/*
	 * formParam da value değerleri input taglarının içinde ki 'name' attributeleri ile aynı olmalıdır
	 */
	
	@POST
	@Path("/kayit")
	@Produces(MediaType.TEXT_PLAIN)
	public Response kayit(@FormParam("ad")String ad,@FormParam("soyad")String soyad)
	{
		System.out.println(ad+ " "+soyad);
		return Response.status(200).entity("Ad : "+ad+"\n"+"Soyad : "+soyad).build();
	}

	
	
	@GET
	@Path("/kayit")
	@Produces(MediaType.TEXT_PLAIN)
	public Response hata()
	{
		return Response.status(404).entity("Bu URL GET Metotdu ile Çalışmıyor").build();
	}
}
