package com.coforge.Day_07_07_26_Exceptions;

import java.io.IOException;

public class LoginSessionDemo {

	public static void validate(String uname,String pwd) {
		if(uname.equals("Atharva")&& pwd.equals("Atharva123")) {
		try(LoginSession session=new LoginSession()){
			session.login();
			session.accessPages();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
		else
			System.out.println("Invalid Credentials, No session");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uname="Atharva", pwd="Atharva123";
		validate(uname,pwd);
		
	}

}
