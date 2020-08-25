package Chapter6;

public class Exercise06_26 {
	
	public static void main(String[] args) {
	
		int number = 0;
		
       int count = 0;
        for (int i = 0; count < 100; i++) {

            if (isPrime(i) && isPalindrome(i)) {
                System.out.printf("%10d", i);
                count++;
                if (count % 10 == 0 && i != 0) System.out.println();

            }

        }
    
					
}
	
	
	
	public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { 
            	return false; 
            }
            
        }

        return true; 
    }
	
	public static boolean isPalindrome(int number) {
		return number == reverse(number) ? true : false;
	}

	public static int reverse(int number) {
		String reverse = "";
		String n = number + "";
		for (int i = n.length() - 1  ; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		return Integer.parseInt(reverse);

	}
	
	
}
