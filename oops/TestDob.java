package com.rays.oops;

public class TestDob {
	public static void main (String []args) {
		Dob d= new Dob();
		 date D= d.parse("06/05/2023");
		//Date d = sdf.parse(Dob);
		System.out.println(d.getDob());
	}

}
