package edu.cis232.example3;

import java.util.concurrent.TimeoutException;

public class ExceptionExample3 {

	public static void main(String[] args){
		try {
			methodOne();
			int i = 5;
			i++;
			System.out.println(i);
		} catch (Exception ex){
			//You should print this exception to a log file, but we are not
			//doing that here.
			
			//Show an error message (user friendly)
			System.out.println(ex.getMessage());
		}
		
		System.out.println("The program continues...");
	}
	
	public static void methodOne() throws Exception{
		throw new TimeoutException("Time out!");
	}

}
