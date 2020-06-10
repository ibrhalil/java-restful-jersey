package com.veri.isleme;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.veri.model.Kisi;


public class VeriyiNesneyeCevirme {

	List<Kisi> liste;
	
	public VeriyiNesneyeCevirme() {
		liste = new ArrayList<>();
	}
	
	public List<Kisi> veriObjYap(String veri) throws JAXBException {
		JAXBContext jaxbc = JAXBContext.newInstance(Kisi.class);
		Unmarshaller shaller = jaxbc.createUnmarshaller();
		Kisi kisi = (Kisi) shaller.unmarshal(new StringReader(veri));
		liste.add(kisi);
		return liste;
	}
	
}
