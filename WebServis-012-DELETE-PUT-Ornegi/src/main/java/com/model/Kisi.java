package com.model;

public class Kisi {

	private String ad;
	private String soyad;
	private String meslek;

	public Kisi() {

	}

	public Kisi(String ad, String soyad, String meslek) {
		this.ad = ad;
		this.soyad = soyad;
		this.meslek = meslek;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getMeslek() {
		return meslek;
	}

	public void setMeslek(String meslek) {
		this.meslek = meslek;
	}
}
