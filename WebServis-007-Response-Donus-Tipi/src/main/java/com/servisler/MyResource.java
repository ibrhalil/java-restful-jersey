package com.servisler;

import java.util.ArrayList;
import java.util.List;

import com.model.Kisi;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/servis")
public class MyResource {

	List<Kisi> kisiListe = new ArrayList<Kisi>();
	
	public MyResource() {
		kisiListe.add(new Kisi("Halil", "Aydın", "İstanbul"));
		kisiListe.add(new Kisi("Adnan", "Zengin", "İstanbul"));
		kisiListe.add(new Kisi("Yakup", "Kiro", "Adana"));
		kisiListe.add(new Kisi("Deli", "Yürek", "Muş"));
		kisiListe.add(new Kisi("Kenan", "Mete", "İzmir"));
		kisiListe.add(new Kisi("Yenil", "Kazım", "Kütahya"));
	}
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "servis/kisiler\nservis/id/{id_no}";
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/kisiler")
    public Response kisiler() {
    	
		return Response.status(200).entity(kisiListe).build();
	}
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/id/{id_no}")
    public Response kisiID(@PathParam("id_no")String id) 
    {
    	int deger=0;
    	try {
    		deger= Integer.valueOf(id);
		} 
    	catch (Exception e) 
    	{
    		return Response.status(500).entity("Sayı Girmen Gerekiyordu Dostum.").build();
		}
    	
    	if(deger < kisiListe.size() && deger >= 0)
    	{
    		return Response.status(200).entity(kisiListe.get(deger)).build();
    	}
    	
		return Response.status(404).entity("Kişi Bulunamadı").build();
	}
    
}
