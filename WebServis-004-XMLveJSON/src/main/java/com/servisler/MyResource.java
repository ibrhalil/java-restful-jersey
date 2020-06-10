package com.servisler;

import java.util.ArrayList;
import java.util.List;

import com.model.Personel;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;




@Path("personelliste")
public class MyResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "XML ve JSON Model Listeleme\n/xml gösterim\n/json gösterim";
    }
    
    
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/xml")
    public List<Personel> personelListesi1() {
    	List<Personel> liste = new ArrayList<>();
    	liste.add(new Personel("Halil","Aydın","1234567890","Erkek"));
    	liste.add(new Personel("Mehmet","Kenen","4658465468","Erkek"));
    	liste.add(new Personel("Nurten","Kızılcık","4564861448","Kadın"));
    	liste.add(new Personel("İlayda","Pek","5674684636","Kadın"));
    	liste.add(new Personel("Murat","Urban","1456186864","Erkek"));
    	liste.add(new Personel("İbrahim","Gün","4784895748","Erkek"));
		return liste;
	}
    
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/json")
    public List<Personel> personelListesi2() {
    	List<Personel> liste = new ArrayList<>();
    	liste.add(new Personel("Halil","Aydın","1234567890","Erkek"));
    	liste.add(new Personel("Mehmet","Kenen","4658465468","Erkek"));
    	liste.add(new Personel("Nurten","Kızılcık","4564861448","Kadın"));
    	liste.add(new Personel("İlayda","Pek","5674684636","Kadın"));
    	liste.add(new Personel("Murat","Urban","1456186864","Erkek"));
    	liste.add(new Personel("İbrahim","Gün","4784895748","Erkek"));
		return liste;
	}
    
    
    
   
}
