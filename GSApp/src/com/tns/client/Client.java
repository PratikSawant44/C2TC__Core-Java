package com.tns.client;

import com.tns.application.*;
import com.tns.framework.*;

public class Client {

	public static void main(String[] args) {
		
		ShopFactory shopfactory = new GSShopFactory();
		PrimeAcc  primeacc = new  GSPrimeAcc(1, "Mr Modi", 2000, true);
		NormalAcc  normalacc = new  GSNormalAcc(1, "Mr Biden", 2000, 200);
		primeacc.bookProduct(1000);
		normalacc.bookProduct(1000);		
		System.out.println(primeacc.toString());		
		System.out.println();
		System.out.println(normalacc.toString());
		

	}

}
