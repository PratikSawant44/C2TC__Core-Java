package com.tns.framework;

public abstract class NormalAcc extends  ShopAcc {
	
	private final float deliveryCharges = 200;
	float charges ;

	public float getDeliveryCharges() {
		return deliveryCharges;
	}
	
	public NormalAcc(int AccNo, String accNm, float charges, float deliveryCharges) {
		
		super(AccNo, accNm, charges);
		this.charges = charges;
	}

	@Override
	public void bookProduct(float charges) {
		
		super.bookProduct(charges);
	}

	@Override
	public String toString() {
		
		return (super.toString()+"\n"+"As a NonPrime user your delivery charges will be taken "+"\n"+"Your "
				+ "product charges are --->"+charges+" and Delivery charges --->"+deliveryCharges+"\n"+"With a "
						+ "GrandTotal of ---->"+(charges+deliveryCharges));
	}
}