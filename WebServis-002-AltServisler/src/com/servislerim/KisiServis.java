package com.servislerim;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("kisi")
public class KisiServis {
	
	String ad = "Halil";
	String soyad = "Aydýn";
	int yas = 24;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String AnaServis() {
		return ad + " " +
			   soyad + " " + 
			   yas;
	}
	
	@GET @Produces(MediaType.TEXT_PLAIN) @Path("/isim")
	public String isim() {
		return ad;
	}
	
	@GET @Produces("text/plain") @Path("/soyisim")
	public String soyisim() {
		return soyad;
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/yas")
	public int yas() {
		return yas;
	}
}
