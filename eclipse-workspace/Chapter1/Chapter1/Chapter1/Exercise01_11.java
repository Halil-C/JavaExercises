package Chapter1;

public class Exercise01_11 {

	public static void main(String[] args) {
		
		System.out.println("First year population = ");
		
		System.out.println( 312032486 
							+ (365 * 24 * 60 * 60) / 7 
							- (365 * 24 * 60 * 60) / 13 
							+ (365 * 24 * 60 * 60) / 45);
		
		System.out.println("Second year population = ");
		
		System.out.println( 312032486 
				+ 2* ((365 * 24 * 60 * 60) / 7) 
				- 2* ((365 * 24 * 60 * 60) / 13) 
				+ 2* ((365 * 24 * 60 * 60) / 45));
		
		System.out.println("Third year population = ");

		System.out.println( 312032486 
				+ 3* ((365 * 24 * 60 * 60) / 7) 
				- 3* ((365 * 24 * 60 * 60) / 13) 
				+ 3* ((365 * 24 * 60 * 60) / 45));

		System.out.println("Fourth year population = ");

		System.out.println( 312032486 
				+ 4* ((365 * 24 * 60 * 60) / 7) 
				- 4* ((365 * 24 * 60 * 60) / 13) 
				+ 4* ((365 * 24 * 60 * 60) / 45));

		System.out.println("Fifth year population = ");

		System.out.println( 312032486 
				+ 5* ((365 * 24 * 60 * 60) / 7) 
				- 5* ((365 * 24 * 60 * 60) / 13) 
				+ 5* ((365 * 24 * 60 * 60) / 45));

	}
	
}
