package Chapter5;

public class Exercise05_07 {

	public static void main(String[] args) {

		int totalTuition = 0;
		int tuition = 10_000;
		int tuitionInYearTen = 0;
		
		for (int year = 1 ; year <=14 ; year++) {
		
			tuition += (tuition * 0.05);
			 
					if (year >10)
					{
						totalTuition += tuition;
					}
					if (year == 10)
					{
						tuitionInYearTen = tuition;
					}
		}
					System.out.println("Tuition in year 10 is $" + tuitionInYearTen);
					
					System.out.println("Total cost for four years' worth of tuition" +
							" after the tenth year: $" + totalTuition);
	}

}
