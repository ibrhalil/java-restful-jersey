package com.servisler;

import java.util.ArrayList;
import java.util.List;

import com.model.Urun;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("urunlerliste")
public class UrunlerServis {

	List<Urun> liste;
	
	public UrunlerServis() {
		liste=new ArrayList<>();
		liste.add(new Urun("Bilgisayar",150,true));
		liste.add(new Urun("Telefon",0,false));
		liste.add(new Urun("Konsol",250,true));
		liste.add(new Urun("Monitör",100,true));
		liste.add(new Urun("Klavye",0,false));
		liste.add(new Urun("Kulaklık",50,true));
		liste.add(new Urun("Fare",10,false));
		liste.add(new Urun("Mikrafon",0,true));
	}

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Urun> urunlerListe() {
    	
        return liste;
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/ilk")
    public Urun ilkUrun() {
    	
		return liste.get(0);
	}
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/son")
    public Urun sonUrun() {
    	
		return liste.get(liste.size()-1);
	}
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/urun/{id}")
    public Urun urunGetir(@PathParam("id")String id) {
    	
    	if (Integer.valueOf(id) >= 0 && Integer.valueOf(id) < liste.size()) {
			return liste.get(Integer.valueOf(id));
		}
    	
		return null;
	}
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/urun/{stok}/{adet}")
    public List<Urun> urunGetir2(@PathParam("stok")String stok,@PathParam("adet")String adet) {
    	
    	List<Urun> liste2 = new ArrayList<Urun>();
    	
    	for (Urun urun : liste) {
			if(urun.isStokDurum() == (boolean) Boolean.valueOf(stok))
			{
				if(urun.getAdet()>=Integer.valueOf(adet))
				{
					liste2.add(urun);
				}
			}
		}
    	
		return liste2;
	}
}
