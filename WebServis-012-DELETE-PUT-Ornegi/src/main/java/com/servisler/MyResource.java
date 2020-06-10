package com.servisler;

import java.util.LinkedList;
import java.util.List;

import com.model.Kisi;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("servis")
public class MyResource {

	static List<Kisi> liste = new LinkedList<Kisi>();
	static
	{
		liste.add(new Kisi("Ahmet", "Demir", "Öğrenci"));
		liste.add(new Kisi("Murat", "Kil", "Müdür"));
		liste.add(new Kisi("Eylül", "Kızıl", "Yazar"));
		liste.add(new Kisi("Eyüp", "Sabri", "Polis"));
		liste.add(new Kisi("Mehmet", "Can", "Asker"));
	}
	
    @GET
    @Produces(MediaType.TEXT_HTML+";charset=UTF-8")
    public String getIt() {
        return "<a href='servis/liste'>Listele(GET)</a><br>"
        	 + "<a href='servis/ekle'>Ekle(POST)</a><br>"
        	 + "<a href='servis/sil/murat'>Sil(DELETE)</a><br>"
        	 + "<a href='servis/sil/id/0'>Baştan Sil(DELETE)</a><br>"
        	 + "<a href='servis/sil/id/"+(liste.size()-1)+"'>Sondan Sil(DELETE)</a><br>"
        	 + "<a href='servis/guncelle/id/2'>Güncelle(PUT)</a><br>";
    }
    
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/liste")
    public Response listele() {
    	
		return Response.status(200).entity(liste).build();
	}
    
    @POST
    @Path("/ekle")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_HTML)
    public Response ekle(Kisi kisi)
    {
    	liste.add(kisi);
    	return Response.status(200).entity("Ekleme Başarılı").build();
    }
    
    /*Örnek Ekleme
     * {
			"ad":"Kemal",
			"meslek":"Futbolcu",
			"soyad":"Pas"
	}*/
    
    @DELETE
    @Path("/sil/{isim}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response silme(@PathParam("isim")String isim)
    {
    	for (Kisi kisi : liste) {
			if(kisi.getAd().toLowerCase().equals(isim.toLowerCase()))
			{
				liste.remove(kisi);
				return Response.status(200).entity("Silme Başarılı").build();
			}
		}
    	return Response.status(404).entity(isim+" Kayıt Bulunmadı").build();
    }
    
    @DELETE
    @Path("/sil/id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response silmeID(@PathParam("id")String id)
    {
    	
    	int deger = Integer.valueOf(id);
    	
    	if(deger>=0 && deger<liste.size())
    	{
    		Kisi silinenKisi = liste.remove(deger);
    		return Response.status(200).entity(silinenKisi).build();
    	}
    	return Response.status(404).entity(new Kisi()).build();
    }
    
    @PUT
    @Path("/guncelle/id/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response guncelleme(@PathParam("id")String id,Kisi kisi)
    {
    	
    	int deger = Integer.valueOf(id);
    	
    	if(deger>=0 && deger<liste.size())
    	{
    		liste.set(deger, kisi);
    		return Response.status(200).entity(liste).build();
    	}
    	return Response.status(404).entity(new Kisi()).build();
    }
}
