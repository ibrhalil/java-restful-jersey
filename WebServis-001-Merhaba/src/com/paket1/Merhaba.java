package com.paket1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("selamla")	//site içerisinde belirtilen yolda çalýþýr
public class Merhaba {

	@GET								//Bu metodun bir GET isteði ile çalýþtýrýlmasý	
	@Produces(MediaType.TEXT_PLAIN)		//çalýþan bu metodun ne döndürdüðünü tanýmladýðýmýz kýsýmdýr
	public String Selam() {
		return "Merhaba Dünya";
	}
	
}


/*
 *	Öncelikle Gerekli Baðýmlýlýklarý eklemeliyiz
 * 	bunlar;
 * 
 * 	pom.xml içerisinde bulunmaktadýr
 * 
 * 	Sonrasýnda bu class'a web servis özelliði kazandýrmak için web.xml de bazý eklemeler yapýlmalýdýr
 * 
 */	
