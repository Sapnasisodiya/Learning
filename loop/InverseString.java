package com.rays.loop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InverseString {
	public static void main (String[] args) throws ParseException {
		Date d = new Date();
		//System.out.println(d);
		
		String dob = "26/09/2000";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		Date d1 = sdf.parse(dob);
		System.out.println(d1);
		
	}

}
