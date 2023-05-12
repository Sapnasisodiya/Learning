package com.rays.loop;

public class Foreachloop4 {
	public static void main (String []args) {
		int sum = 0;
		int[] table = {10,20,30,40,50};
		for (int i =0; i<table.length; i++) {
			System.out.println(table[i]);
			sum = sum + table[i];
		}
		System.out.println("sum =" + sum);
	}

}
