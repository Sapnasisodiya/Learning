package com.rays.loop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	
	public static void main (String[] args) {
		Date d = new Date();
		//System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(d);
		String s = sdf.format(d);
		System.out.println(s);
		
	}

}
