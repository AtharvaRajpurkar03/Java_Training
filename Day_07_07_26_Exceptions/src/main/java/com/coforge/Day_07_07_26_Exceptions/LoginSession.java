package com.coforge.Day_07_07_26_Exceptions;

import java.io.Closeable;
import java.io.IOException;

public class LoginSession implements Closeable{

	public void login() {
		System.out.println("user logged in ");
	}
	
	public void accessPages() {
		System.out.println("User accessing pages");
	}
	
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("session completed automatically");
	}

}
