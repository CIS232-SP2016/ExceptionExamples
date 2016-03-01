package edu.cis232.example7;

public class UncheckedExceptions {

	String name;
	
	public static void main(String[] args) {
		UncheckedExceptions program = new UncheckedExceptions();
		try{
			program.run();
		} catch (NullPointerException ex){
			System.out.println("Error! The `name` field was never set.");
		} catch (IndexOutOfBoundsException ex){
			System.out.println("Tried to access a character index that does not exist. Index goes from 0 to length -1");
		}
	}
	
	public void run(){
		name = "Bob";
		System.out.println(name.length());
		name.charAt(name.length());
	}

}
