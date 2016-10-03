package edu.cis232.example9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinallyWithFileIOExample {

	public static void main(String[] args) {
		Scanner input = null;
		try {
			File file = new File("numbers.txt");
			input = new Scanner(file);
			// The following code does not execute if the previous line throws
			// an Exception.
			int total = 0;
			while (input.hasNextLine()) {
				total += Integer.parseInt(input.nextLine());
			}
			System.out.printf("The total is %,d%n", total);
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found!");
		} catch (NumberFormatException e) {
			System.out.println("File has non-numbers. Aborted");
		} finally {
			System.out.println("The file is closing");
			if (input != null) {
				input.close();
				System.out.println("The file was closed");
			} else {
				System.out.println("The file did not exist");
			}
		}
	}

}
