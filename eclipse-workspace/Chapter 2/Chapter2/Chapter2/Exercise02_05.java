package Chapter2;
import java.util.Scanner;

public class Exercise02_05 {

	public static void main(String[] args) {
		
		System.out.println("Enter the subtotal and a gratuity rate:");
		
		Scanner input = new Scanner(System.in);
		
		double subtotal = input.nextDouble();
		
		double gratuityrate = input.nextDouble();
		
		double gratuity = (subtotal * gratuityrate) / 100;
		
		double total = subtotal + gratuity ;
		
		System.out.println("The gratuity is $" +  gratuity +  " and total is $" + total );
		
		
		
	}
	
}
