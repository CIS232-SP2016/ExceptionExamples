package edu.cis232.example5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CatchMultipleExceptions {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("What is the name of the numbers file?");
			File file = new File(keyboard.nextLine());
			Scanner input = new Scanner(file);
			int total = 0;
			while(input.hasNextLine()){
				total += Integer.parseInt(input.nextLine());
			}
			System.out.printf("The total is %d%n", total);
			input.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("The file was not found, restart!");
		} 
		catch (NumberFormatException e){
			System.out.printf("There was an error while reading the file: %s%n", e.getMessage());
		}
		catch (Exception e){
			System.out.println("Some error happened!");
			e.printStackTrace();
		}
		 
		
		
		System.out.println("Bye!");
	}
	
	

}
