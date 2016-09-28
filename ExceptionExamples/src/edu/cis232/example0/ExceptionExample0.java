package edu.cis232.example0;

public class ExceptionExample0 {

	public static void main(String[] args){
		
		int[] numbers = {1,2,3};
		for(int i = 0; i <= numbers.length; i++){
			System.out.println(numbers[i]);
		}
		
		//won't print
		System.out.println("bye!");
	}

}
