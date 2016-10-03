package edu.cis232.example9;

public class FinallyExample {

	public static void main(String[] args) {
		
		try {
			String name = null;
			System.out.println(name.charAt(0));
		} catch(NullPointerException e){
			e.printStackTrace(System.out);
		} finally {
			System.out.println("Finally!");
		}
		
		System.out.println("The program continues.");

	}

}
