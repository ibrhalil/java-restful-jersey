package com.test;

import javax.xml.bind.JAXBException;

import com.veri.cek.servis.ServisVeriCek;
import com.veri.isleme.VeriyiNesneyeCevirme;
import com.veri.model.Kisi;

public class Test {

	public static void main(String[] args) {
		String url = "http://localhost:8080/WebServis-012-DELETE-PUT-Ornegi/webapi/servis/liste";
		String veri = (new ServisVeriCek()).veriCek(url,"GET");
		try {
			Kisi kisi1 =(new VeriyiNesneyeCevirme()).veriObjYap(veri).get(0);
			System.out.println(kisi1.getAd());
			System.out.println(kisi1.getSoyad());
			System.out.println(kisi1.getMeslek());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
