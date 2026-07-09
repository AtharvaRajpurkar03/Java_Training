package com.coforge.Day_07_07_26_Exceptions;

import java.io.IOException;

public class TryWithResourseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Printer printer=new Printer()){
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
