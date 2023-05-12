package com.rays.oops;

public class Shape {

	private String color = null;
	private int borderWidth = 0;
	public Shape () {
		
	}
	public Shape (String color,int borderWidth ) {
		this.color = color;
		this.borderWidth = borderWidth;
	}

	public void setColor(String c) {
		color = c;
	}
	public void setBorderWidth(int bw ) {
		borderWidth = bw;
	}

	public String getColor() {
		return color;

	}
	public int getBorderWidth() {
		return borderWidth;
	}

}
