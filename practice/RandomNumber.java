package com.rays.practice;

import java.util.Random;

public class RandomNumber {
	public static void main (String []args) {
		Random rand = new Random();
		for(int i=0; i<=5; i++) {
			System.out.println(Math.random()*100);
		}
	}

}
