package learning;

import java.nio.file.Watchable;

import demoPak.CentralTraffic;

public class IndiaTraffic implements CentralTraffic{

	public static void main(String[] args) {
		CentralTraffic c= new IndiaTraffic();
		c.greenGo();
		c.redStop();
		c.yelloFlash();
		System.out.println(a);
		IndiaTraffic ind= new IndiaTraffic();
		ind.walk();
		
	}
	public void walk() {
		System.out.println("walk implementation");
			
		}
	@Override
	public void greenGo() {
	System.out.println("Greengo implementation");
		
	}

	@Override
	public void redStop() {
		System.out.println("redStop implementation");
	}

	@Override
	public void yelloFlash() {
		System.out.println("yelloFlash implementation");
		
	}

}
