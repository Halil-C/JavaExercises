package Chapter6;

public class Exercise06_01 {

	

	    public static void main(String[] args) {

	        for (int i = 1; i <= 100; i++) {

	            System.out.printf("%10s",(i % 10 != 0) ? getPentagonalNumber(i) + " " : getPentagonalNumber(i) + "\n");

	        }
	    }

	    public static int getPentagonalNumber(int n) {
	        return n * (3 * n - 1) / 2;
	    }
	
}


