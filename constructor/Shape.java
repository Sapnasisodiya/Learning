package com.rays.constructor;

public class Shape {
	private String  color = null;
	private int borderWidth = 0;
	public Shape() {
		System.out.println("default constructor");
	}
	public Shape(String c,int b) {
		color = c;
		borderWidth = b;
	}
	 public void setcolor (String color) {
		this.color = color;
	 }
	 public String getcolor() {
		 return color;
	 }
	 public void setborderWidth(int bw) {
		 borderWidth = bw;
	 }
	 public int getborderWidth() {
		 return borderWidth;
	 }

}
