package com.coforge.Day_03_07_26_prj;

public class BMW implements Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car Started Remotely");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Car Stopped Remotely");
	}
	
	@Override
	public void provideAC() {
		System.out.println("AC provided");
	}
	
//	@Override
//	public void musicSystem() {  //overriding is not possible because all cars has same music system
//		
//	}


}
