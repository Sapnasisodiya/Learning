package com.rays.practice;

public class SecondLargest {
	public static void main(String []args) {
		int[] a = {10,50,25,999,500};
		
		int y = 0;
		int x = a[0];
		for(int i = 0; i<a.length; i++) {
			
		
		if (a[i]>x) {
			y =x;
			x =a[i];
		}else if (a[i]>y && a[i]<x) {
			y = a[i];
		}
	}
		System.out.println("second largest number" + y);
	}
}
