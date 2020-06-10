package com.model;

public class Urun {
	
	private String ad;
	private int adet;
	private boolean stokDurum;
	
	public Urun() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Urun(String ad, int adet, boolean stokDurum) {
		super();
		this.ad = ad;
		this.adet = adet;
		this.stokDurum = stokDurum;
	}

	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getAdet() {
		return adet;
	}
	public void setAdet(int adet) {
		this.adet = adet;
	}
	public boolean isStokDurum() {
		return stokDurum;
	}
	public void setStokDurum(boolean stokDurum) {
		this.stokDurum = stokDurum;
	}


	@Override
	public String toString() {
		return "Urun ("+this+") [ad=" + ad + ", adet=" + adet + ", stokDurum=" + stokDurum + "]";
	}
	
	

}
