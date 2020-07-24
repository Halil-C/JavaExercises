package Chapter2;
import java.util.Scanner;

public class Exercise02_11 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of years: ");
		
		Scanner input = new Scanner(System.in);
		
		int years = input.nextInt();
		
		int population =  312032486 
				+  years * ((365 * 24 * 60 * 60) / 7) 
				- years * ((365 * 24 * 60 * 60) / 13) 
				+ years * ((365 * 24 * 60 * 60) / 45);
				
		System.out.println(" The population in " +  years + " years is: " + population );
	
		
		
	}
}
