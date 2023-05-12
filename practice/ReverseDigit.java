package com.rays.practice;

public class ReverseDigit {
	public static void main (String []args) {
		int a = 1234;
		int reverse = 0;
		for (int i =5; i>1; i--) {
			
			int remainder = a%10;
			reverse = reverse*10 + remainder;
			a=a/10;
			
		}
		System.out.println("Reverse Number ="+reverse);
			
		
	}

}
