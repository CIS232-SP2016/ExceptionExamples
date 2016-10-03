package edu.cis232.example8;

public class InvalidMonthException extends Exception {
	
	public InvalidMonthException(int monthNum){
		super(String.format("%d is out of the range of valid months (1-12)", 
				monthNum));
	}
}
