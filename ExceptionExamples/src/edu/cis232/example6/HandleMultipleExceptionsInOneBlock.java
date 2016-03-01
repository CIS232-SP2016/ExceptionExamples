package edu.cis232.example6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HandleMultipleExceptionsInOneBlock {

	public static void main(String[] args) {
		
		try{
			Scanner input = new Scanner(new File("bad.txt"));
		} catch (FileNotFoundException | IllegalArgumentException ex){
			System.out.println("The file does not exist");
		}

	}

}
