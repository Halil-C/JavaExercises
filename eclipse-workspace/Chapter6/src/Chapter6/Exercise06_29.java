package Chapter6;

public class Exercise06_29 {

    public static void main(String[] args) {

    	for (int i = 2; i <=1000; i++) {
    		
    		if(isPrime(i) && isPrime(i+2)) {
    			System.out.printf("(%d , %d)\n", i , i+2);
    		}
    	}		
    			
    	}
       
    	
    	public static boolean isPrime(int i) {
    		
    		for(int divisor = 2; divisor <= i / 2; divisor++ ) {
    			if( i % divisor ==0) {
    				return false;
    			}
    		}
    		return true;
    	}
}
