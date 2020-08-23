package Chapter6;

public class Exercise06_16 {

	public static void main(String[] args) {
		for ( int year = 2000; year <= 2020; year++)
		
		System.out.println("Number of days in " + year + " is " + numberOfDays(year) );
		
			
			
		}
	
	public static int numberOfDays(int year) {
		
		int t = 0;
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) )
		
		t = 366;
		
		else t = 365;
				
		return t;
				
	}
	
}
