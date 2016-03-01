package edu.cis232.example8;

public class IllegalMonthException extends IllegalArgumentException {
	
	public IllegalMonthException(int monthNum){
		super(String.format("%d is out of the range of valid months (1-12)", 
				monthNum));
	}
}
