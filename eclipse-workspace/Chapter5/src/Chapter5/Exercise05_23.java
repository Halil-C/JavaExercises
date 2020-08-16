package Chapter5;

public class Exercise05_23 {
	 public static void main(String[] strings) {


	        double sumRightToLeft = 0.0;
	        for (int i = 50000; i >= 1; i--) {
	            sumRightToLeft += 1.0 / i;
	        }
	        System.out.println("Computing from right to left " + sumRightToLeft);


	        double sumLeftToRight = 0.0;
	        for (int i = 1; i <= 50000; i++) {
	            sumLeftToRight += 1.0 / i;
	        }
	        System.out.println("Computing from left to right " + sumLeftToRight);

	        double difference = sumRightToLeft - sumLeftToRight;
	        System.out.println("difference is " + difference);
	    }
}
