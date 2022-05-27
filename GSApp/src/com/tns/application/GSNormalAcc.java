package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int AccNo, String accNm, float charges, float deliveryCharges) {
		
		super(AccNo, accNm, charges, deliveryCharges);
	}

	@Override
	public void bookProduct(float charges) {
		
		super.bookProduct(charges);
	}

	@Override
	public String toString() {
		
		return super.toString();
	}
	

}
