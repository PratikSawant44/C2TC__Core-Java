package com.customer;

import com.application.MMBankFactory;
import com.application.MMCurrentAcc;
import com.application.MMSavingAcc;

public class Customer
{
	public static void main(String[] args) 
	{
		MMBankFactory mmbfactory = new MMBankFactory();
		mmbfactory.getNewSavingAcc(14545, "Mr Modi", 1500, true);
		mmbfactory.getNewCurrentAcc(15651, "Mr Biden", 3000, 15000);
		
		MMSavingAcc mmsaving = new MMSavingAcc();
		mmsaving.getAccNo();
		mmsaving.getAccNm();
		mmsaving.getAccBal();
		
		mmsaving.withdraw(5000);
		mmsaving.toString();
		
		MMCurrentAcc mmcurrent = new MMCurrentAcc();
		mmcurrent.getAccNo();
		mmcurrent.getAccNm();
		mmcurrent.getAccBal();
		mmcurrent.getCreditLimit();
		
		mmcurrent.withdraw(5500);
		mmcurrent.toString();
	}
}
