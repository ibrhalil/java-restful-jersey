package com.veri.cek.servis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ServisVeriCek {

	public String veriCek(String adres, String metot) {

		try {

			URL url = new URL(adres);
			HttpURLConnection baglanti = (HttpURLConnection) url.openConnection();
			baglanti.setRequestMethod("GET");
			baglanti.setRequestProperty("Accept", "application/json");

			if (baglanti.getResponseCode() != 200) {
				throw new RuntimeException("Baþarýsýz" + baglanti.getResponseCode());
			}

			BufferedReader okuyucu = new BufferedReader(new InputStreamReader(baglanti.getInputStream()));
			String icerik = okuyucu.readLine();
			System.out.println(icerik);

			baglanti.disconnect();
			return icerik;

		} catch (MalformedURLException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return "Hata";
	}

}
