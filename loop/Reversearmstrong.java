package com.rays.loop;

public class Reversearmstrong {
	public static void main (String []args) {
		int number = 153;
		int r;
		int sum = 0;
		int n = number;
		while(n>0) {
			r =n%10;
			sum = (sum*10) + r;
			n = n/10;
		}
		if (sum == number) {
			System.out.println("reverse armstrong number");
		}else {
			System.out.println("reverse armstrong number not");
		}
	}

}
