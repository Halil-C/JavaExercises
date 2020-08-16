package Chapter5;

public class Exercise05_24 {

	public static void main(String[] strings) {

        double total = 0.0;
        for (int i = 1; i <= 97; i += 2) {
            total += (double) i / (i + 2);
            
        }
        System.out.println("Total is: " + total);
    }
	
}
