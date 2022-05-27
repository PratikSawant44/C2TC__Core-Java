package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc {
	
	private boolean isPrime = true;
	private static final float deliveryCharges = 0;
	float charges;
	
	public boolean isPrime() {
		return isPrime;
	}
	public float getDeliveryCharges() {
		return deliveryCharges;
	}
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		
		super(accNo, accNm, charges);
		this.isPrime = isPrime;	
		this.charges = charges;
	}
	
	@Override
	public void bookProduct(float charges) {
		
		super.bookProduct(charges);
	}

	@Override
	public String toString() {
		
		return (super.toString()+"\n"+"As a Prime user your delivery will be free "+"\n"+"Your "
				+ "product  will charge --->"+ charges +" and "
				+ "Delivery charges --->"+deliveryCharges+"\n"+"With a GrandTotal of --->"+(charges+deliveryCharges));
	}
	
} 
