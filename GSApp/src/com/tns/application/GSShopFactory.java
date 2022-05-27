package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		
		PrimeAcc prime = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		return prime;
}

	
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
		
		NormalAcc normal = new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
		return normal;
}

}
