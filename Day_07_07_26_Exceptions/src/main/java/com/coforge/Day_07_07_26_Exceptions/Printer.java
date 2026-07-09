package com.coforge.Day_07_07_26_Exceptions;

import java.io.Closeable;
import java.io.IOException;

public class Printer implements Closeable{

	public void usePrinter() {
		System.out.println("Printer is ready to use, start printing");
	}
	
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Printer closed by try with resourse automatically");
	}

	
}
