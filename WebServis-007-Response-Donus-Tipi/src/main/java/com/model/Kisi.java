package com.model;

public class Kisi {
	private String ad;
	private String soyad;
	private String adres;
	
	public Kisi() {
		// TODO Auto-generated constructor stub
	}
	
	public Kisi(String ad, String soyad, String adres) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.adres = adres;
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
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	

}
