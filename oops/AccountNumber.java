package com.rays.oops;

public class AccountNumber {
	private String number = null;
	
	public void setNumber(String a) {
		number = a;
	}
	public String getNumber() {
		return number;
		
	}
	private String AccountType = null;
	public void setAccountType(String b) {
		AccountType = b;
	}
	public String getAccountType() {
		return AccountType;

	}
	private double Balance = 112.00000;
//	public void setBalance(double d) {
//		Balance = d;
//		
//	}
	public double deposit(double amount) {
		return Balance = Balance + amount;
	}
	
	public double  withdrawal(double wd) {
		return Balance = wd ;
	}
	public double fundTransfer(double phonepe) {
		return Balance = phonepe;
	}
	public double payBill(double creditcard) {
		return Balance = creditcard;
	}
	
	public double getBalance() {
		return Balance = Balance;
	}


}
