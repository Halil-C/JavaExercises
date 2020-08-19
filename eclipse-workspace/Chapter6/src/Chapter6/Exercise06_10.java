package Chapter6;

public class Exercise06_10 {

	 public static void main(String[] args) {

	        int primeCount = 0;
	        for (int i = 2; i <= 10000; i++) {

	            if (isPrime(i)) {
	             primeCount++;
	            }
	        }

	        System.out.println("Total number of prime numbers from 1-1000 is " + primeCount);

	    }

	    public static boolean isPrime(int number) {
	        for (int divisor = 2; divisor <= number / 2; divisor++) {
	            if (number % divisor == 0) { 
	                return false; 
	            }
	        }

	        return true; 
	    }
}
