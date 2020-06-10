package com.paket1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("selamla")	//site i�erisinde belirtilen yolda �al���r
public class Merhaba {

	@GET								//Bu metodun bir GET iste�i ile �al��t�r�lmas�	
	@Produces(MediaType.TEXT_PLAIN)		//�al��an bu metodun ne d�nd�rd���n� tan�mlad���m�z k�s�md�r
	public String Selam() {
		return "Merhaba D�nya";
	}
	
}


/*
 *	�ncelikle Gerekli Ba��ml�l�klar� eklemeliyiz
 * 	bunlar;
 * 
 * 	pom.xml i�erisinde bulunmaktad�r
 * 
 * 	Sonras�nda bu class'a web servis �zelli�i kazand�rmak i�in web.xml de baz� eklemeler yap�lmal�d�r
 * 
 */	
