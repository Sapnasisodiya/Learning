package com.rays.oops;

public class AutoMobile {
	private String color = null;
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	private int Speed = 0;
	public void setSpeed(int s) {
		Speed = s;
	}
	public int getSpeed() {
		return Speed;
	}
	private String make = null;
	public void setMake(String m) {
		make = m;
	}
	public String getMake() {
		return make;
	}
	public static int NO_OF_GEARS = 7;
	public void setNO_OF_GEARS(int g) {
		NO_OF_GEARS = g;
	}
	public int getNO_OF_GEARS() {
		return NO_OF_GEARS;
	}
	public static int Break(int b) {
		return b;
	}
	public static int ChangeGear(int gear) {
		return gear;
	}
	public static int accelerator(int ac) {
		return ac;
	}
	}


