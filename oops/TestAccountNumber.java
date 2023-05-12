package com.rays.oops;

public class TestAccountNumber {
	public static void main (String []args) {
		AccountNumber a = new AccountNumber() ;
			a.setNumber("Account number : 123456");
			System.out.println(a.getNumber());
	
	
			AccountNumber b = new AccountNumber();
			b.setAccountType("saving account");
			System.out.println(b.getAccountType());
			
			AccountNumber d = new AccountNumber();
//			d.setBalance(1000.000);
			System.out.println("total balance : " + d.getBalance());
			
			AccountNumber cash = new AccountNumber();
			double c = cash.deposit(100.00);
			System.out.println("deposit ammount :" +c);
			
			AccountNumber credit = new AccountNumber();
			double wd = credit.withdrawal(200.00);
			System.out.println("withdrwal ammount :" + wd);
			
			AccountNumber t = new AccountNumber();
			double tf = t.fundTransfer(2);
			System.out.println( "phonepe transfer :"+tf);
			
			AccountNumber Bill = new AccountNumber();
			double bill = Bill.payBill(5);
			System.out.println("credit card billpay :"+ bill);
			//System.out.println("avaiable balance "+ );
	}
}