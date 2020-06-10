package com.servisler;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("servis")
public class Servis2 {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String deger() {
		return "Değerlerimize sahip Çıkalım.";
	}
}
