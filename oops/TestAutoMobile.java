package com.rays.oops;

public class TestAutoMobile {
	public static void main (String []args) {
		AutoMobile a = new AutoMobile();
		a.setColor("black");
		System.out.println("bike color :"+a.getColor());
	

	
		AutoMobile s = new AutoMobile();
		s.setSpeed(60);
		System.out.println("speed of bike :"+s.getSpeed());

		AutoMobile m = new AutoMobile();
			m.setMake("batter");
			System.out.println("quality:"+m.getMake());
			
		AutoMobile g = new AutoMobile();
		g.setNO_OF_GEARS(7);
		System.out.println("type of gear:"+g.getNO_OF_GEARS());
		
		AutoMobile b = new AutoMobile();
		int bk = b.Break(2);
		System.out.println("type of break :"+ bk);
		
		AutoMobile G = new AutoMobile();
		int cg = G.ChangeGear(5);
		System.out.println("change the gear :"+ cg);
		
		AutoMobile A = new AutoMobile();
		int ac = A.accelerator(1);
		System.out.println("increase speed " );
	}
	
	
	
}