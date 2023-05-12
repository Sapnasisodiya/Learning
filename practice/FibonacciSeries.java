package com.rays.practice;

public class FibonacciSeries {
	public static void main (String []args) {
		int a = 0;
		int b = 1;
		
		int number = 10;
		for(int i=0; i<=number; i++) {
			int c = a+b;
		
		
			System.out.print(" " +c);
			a=b;
			b=c;
		}	
	}

}
