package com.coforge.Day_07_07_26_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CheckedExceptionsDemo {

	public static void readFile(){
		// File f=new File ("data.txt");
		try(Scanner sc=new Scanner(new File("data.txt"))){
		System.out.println(sc.nextLine());
		}
		catch(FileNotFoundException f) {
			f.printStackTrace();
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		readFile();
	}

}
