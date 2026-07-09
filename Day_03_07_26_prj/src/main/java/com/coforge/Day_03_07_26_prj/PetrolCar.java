package com.coforge.Day_03_07_26_prj;

public interface PetrolCar {
	public default void provideAC() {
		System.out.println("Petrol car provides normal AC");
	}
}
