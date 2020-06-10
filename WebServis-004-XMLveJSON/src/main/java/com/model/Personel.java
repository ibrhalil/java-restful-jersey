package com.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement			//POJOmuzu XML yapısına döndürebileceğimiz yapıyı içeriyor
@XmlAccessorType(XmlAccessType.FIELD)	//değişkenlerin üzerinden kontrol yapar 	set Metotları üzerinden kontrol yapılacaksa --> @XmlAccessorType(XmlAccessType.PROPERTY) diye yazılır
public class Personel {
	
	@XmlElement
	private String ad;
	@XmlElement
	private String soyad;
	@XmlElement
	private String tcNo;
	@XmlElement
	private String cinsiyet;
		
	public Personel()
	{
		
	}
	
	public Personel(String ad, String soyad, String tcNo, String cinsiyet) {
		this.ad = ad;
		this.soyad = soyad;
		this.tcNo = tcNo;
		this.cinsiyet = cinsiyet;
	}
	
	public String getAd() {
		return ad;
	}
	//	@XmlElement buraya da yazılabilir ama  @XmlAccessorType(XmlAccessType.PROPERTY) yazılmalı
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public String getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	
	
	
}
