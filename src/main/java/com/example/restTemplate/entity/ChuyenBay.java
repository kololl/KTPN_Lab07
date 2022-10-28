package com.example.restTemplate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



public class ChuyenBay {

	private String maCB;
	

	private String gaDi;
	

	private String gaDen;
	

	private int doDai;

	private int chiPhi;
	

	private Date gioDen;
	

	private Date gioDi;
	public ChuyenBay(String maCB, String gaDi, String gaDen, int doDai, int chiPhi, Date gioDen, Date gioDi) {
		super();
		this.maCB = maCB;
		this.gaDi = gaDi;
		this.gaDen = gaDen;
		this.doDai = doDai;
		this.chiPhi = chiPhi;
		this.gioDen = gioDen;
		this.gioDi = gioDi;
	}
	public ChuyenBay() {
		super();
	}
	public String getMaCB() {
		return maCB;
	}
	public void setMaCB(String maCB) {
		this.maCB = maCB;
	}
	public String getGaDi() {
		return gaDi;
	}
	public void setGaDi(String gaDi) {
		this.gaDi = gaDi;
	}
	public String getGaDen() {
		return gaDen;
	}
	public void setGaDen(String gaDen) {
		this.gaDen = gaDen;
	}
	public int getDoDai() {
		return doDai;
	}
	public void setDoDai(int doDai) {
		this.doDai = doDai;
	}
	public int getChiPhi() {
		return chiPhi;
	}
	public void setChiPhi(int chiPhi) {
		this.chiPhi = chiPhi;
	}
	public Date getGioDen() {
		return gioDen;
	}
	public void setGioDen(Date gioDen) {
		this.gioDen = gioDen;
	}
	public Date getGioDi() {
		return gioDi;
	}
	public void setGioDi(Date gioDi) {
		this.gioDi = gioDi;
	}
	
	
	
}
