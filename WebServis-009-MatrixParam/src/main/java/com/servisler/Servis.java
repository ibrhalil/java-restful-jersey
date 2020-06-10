package com.servisler;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.MatrixParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/servis")
public class Servis {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String metot()
	{
		return "Servis Dizini\n\n/matrix;ad=isim;soyad=soyisim";
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN+";charset=UTF-8")
	@Path("/matrix")
	public Response matrixMetot(@MatrixParam("ad")String ad,@MatrixParam("soyad")String soyad)
	{
		System.out.println(ad+ " "+ soyad);
		return Response.status(200).entity(ad+ " " + soyad).build();
	}

}
