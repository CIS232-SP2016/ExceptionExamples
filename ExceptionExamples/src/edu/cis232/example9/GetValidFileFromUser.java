package edu.cis232.example9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetValidFileFromUser {

	public static void main(String[] args) {
		Scanner input = getValidFileFromUser();
		while(input.hasNextLine()){
			System.out.println(input.nextLine());
		}
		input.close();
	}
	
	/**
	 * Use an input validation loop to ensure the file name
	 * that a user enters actually exists and can be opened.
	 * @return A Scanner to a valid file
	 */
	public static Scanner getValidFileFromUser(){
		Scanner input = null;
		Scanner keyboard = new Scanner(System.in);
		
		while(input == null){
			System.out.println("Please enter a file name:");
			String filename = keyboard.nextLine();
			try {
				input = new Scanner(new File(filename));
			} catch (FileNotFoundException e) {
				System.out.println("File does not exist!");
			}
		}
		
		return input;
	}

}
