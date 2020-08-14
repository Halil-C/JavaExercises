package Chapter5;

public class Exercise05_13 {
	
	public static void main(String[] args) {
		int n = 0; 

		while (Math.pow(n , 3) < 12000) {
			n++; 		
		}
		n--;
		System.out.println(
			"Largest integer n such that n^3 is less than 12,000 is: " + n);
	}
}
