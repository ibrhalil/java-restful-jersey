package com.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Kisi {

	@XmlElement
	private String ad;
	@XmlElement
	private String soyad;
	@XmlElement
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
