package edu.cis232.example4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CatchFileIOException {

	public static void main(String[] args){
		try {
			File file = new File("file.txt");
			Scanner input = new Scanner(file);
			//The following code does not execute if the previous line throws an Exception.
			while(input.hasNextLine()){
				System.out.println(input.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found!");
		}
		
	}

}
