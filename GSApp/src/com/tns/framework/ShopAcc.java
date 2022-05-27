package com.tns.framework;

public abstract class ShopAcc {
	
	private int accNo;
	private String accNm;
	private float charges;
	
	
	public int getAccNo() {
		return accNo;
	}

	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	
	public float getCharges() {
		return charges;
	}
	
	public ShopAcc(int accNo, String accNm, float charges) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
		
	}
	
	public void bookProduct(float charges) {
		
	} 
	
	public void items(float charges) {
		
		
	}
	
	public String toString() {
		
		return "Hello "+accNm+"!";
	}


}
