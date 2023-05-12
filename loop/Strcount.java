package com.rays.loop;

public class Strcount {
	public static void main (String []args) {
		String s = "hello java";
		int count = 0;
		char c = 'a';
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)==c) {
				count++;
			}
		}
		System.out.println("count = " + count);
	}

}
