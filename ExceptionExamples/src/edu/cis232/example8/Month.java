package edu.cis232.example8;

public class Month {
	int month;

	public Month(int monthNum) throws InvalidMonthException{
		if (monthNum < 1 || monthNum > 12) {
			throw new InvalidMonthException(monthNum);
		}
		this.month = monthNum;
	}

	public String getName() {
		String name = "";
		switch (month) {
		case 1:
			name = "January";
			break;
		case 2:
			name = "February";
			break;
		case 3:
			name = "March";
			break;
		default:
			name = "Other month";
		}
		
		return name;
	}
}
