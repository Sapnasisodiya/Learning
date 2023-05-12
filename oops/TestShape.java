package com.rays.oops;

public class TestShape {
	public static void main (String []args) {
		
		Shape s = new Shape("red",50) ;
		 
			
		//s.setColor("red");
		//s.setBorderWidth(10);
		
		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());
	}

}
