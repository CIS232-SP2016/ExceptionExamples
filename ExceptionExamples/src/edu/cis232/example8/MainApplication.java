package edu.cis232.example8;

public class MainApplication {

	public static void main(String[] args) {
		Month m = null;
		try{
			m = new Month(0);
		}
		catch (InvalidMonthException e){
			System.out.println(e.getMessage());
		}
		System.out.println(m.getName());
		
	}

}
