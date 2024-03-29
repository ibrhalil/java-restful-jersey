package com.paket1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("selamla")	//site içerisinde belirtilen yolda çalışır
public class Merhaba {

	@GET								//Bu metodun bir GET isteği ile çalıştırılması	
	@Produces(MediaType.TEXT_PLAIN)		//çalışan bu metodun ne döndürdüğünü tanımladığımız kısımdır
	public String Selam() {
		return "Merhaba Dünya";
	}
	
}


/*
 *	Öncelikle Gerekli Bağımlılıkları eklemeliyiz
 * 	bunlar;
 * 
 * 	pom.xml içerisinde bulunmaktadır
 * 
 * 	Sonrasında bu class'a web servis özelliği kazandırmak için web.xml de bazı eklemeler yapılmalıdır
 * 
 */	
