package Chapter5;

public class Exercise05_12 {

	 public static void main(String[] args) {

	        int n = 0;

	        while (Math.pow(n, 2) < 12000) {
	            n++;
	        }

	        System.out.println(n + " is the lowest number, such that n^2 is greater than 12,000");
	 	}
}