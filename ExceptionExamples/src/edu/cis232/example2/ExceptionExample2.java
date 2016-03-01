package edu.cis232.example2;

public class ExceptionExample2 {

	public static void main(String[] args) throws Exception {
		methodOne();
		
		System.out.println("The program continues!");
	}

	public static void methodOne() throws Exception{
		methodTwo();
	}
	
	public static void methodTwo() throws Exception{
		throw new Exception();
	}
}
