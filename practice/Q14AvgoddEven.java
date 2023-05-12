package com.rays.practice;

public class Q14AvgoddEven {
	public static void main (String []args) {
		
		int odd = 15;
		int sum =0;
		for(int i =1; i<=odd; i =i+2) {
			System.out.println(i);
			sum = sum +i;
		}
		System.out.println("sum of odd" + sum);
		
		int even = 20;
		int sum1 = 0;
		for(int j =2; j<=even; j=j+2) {
			System.out.println(j);
			sum1= sum1+j;
		}
		System.out.println("sum of even" + sum1);
	}

}
