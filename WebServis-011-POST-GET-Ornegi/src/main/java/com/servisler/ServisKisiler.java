package com.servisler;

import java.util.ArrayList;
import java.util.List;

import com.model.Kisi;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.GenericEntity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/personel")
public class ServisKisiler {

	static private List<Kisi> liste = new ArrayList<Kisi>();
	
	static {
		liste.add(new Kisi("Halil", "Aydın", "Yazılım Geliştirici"));
		liste.add(new Kisi("İbrahim", "Aydın", "Programcı"));
		liste.add(new Kisi("Mehmet", "Kenan", "Öğretmen"));
		liste.add(new Kisi("Gökhan", "Kuran", "Öğrenci"));
		liste.add(new Kisi("Adnan", "Teke","İşsiz"));
	}

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "/personelliste\nile personel listesini göster (GET isteği)\n\naynı adrese POST işlimi ile JSON verisi gönderilerbilir";
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/personelliste")
    public Response personelListele() {
    	
		return Response.status(200).entity(liste).build();

	}
    
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)//post ile gelen veri tipini 
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/personelliste")
    public Response personelEkle(Kisi kisi) {
    	
    	if(kisi != null)
    	{
    		liste.add(kisi);
    		return Response.status(200).entity("Eklendi").build();
    	}
		return Response.status(406).entity("Boş Data").build();

	}
    
    /*
     * ÇAL;IŞMIYOR
     */
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/personelxmlliste")
    public Response personelListeXML() {
    	
    	GenericEntity<List<Kisi>> entity = new GenericEntity<List<Kisi>>(liste){};//belki düzelir diye bulunan bir çözüm
		return Response.status(200).entity(entity).build();

	}
    
    /*
     * ****************************
     */
    
    
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})//dizi olarak birden fazla veri gönderme çeşidi sağlayabiliriz
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/personelliste2")
    public Response personelEkle2(Kisi kisi) {
    	
    	if(kisi != null)
    	{
    		liste.add(kisi);
    		return Response.status(200).entity(kisi).build();
    	}
		return null;

	}
    
    
}
