package Chapter3;

import java.util.Scanner;

public class Exercise03_18 {

	public static void main(String[] args) {
		
		System.out.print("Enter the weight of the package:");
		
		Scanner input = new Scanner(System.in);
		
		double w = input.nextDouble();
		
		if ( 0 < w && w <= 1)
		{
			System.out.println("The cost of shipping is $" + 3.5);
		} 
		
		else if (w > 1 && w <=3)
		
		{
			System.out.println("The cost of shipping is $" + 5.5);
			
		}
		else if (w > 3 && w <=10)
			
		{
			System.out.println("The cost of shipping is $" + 8.5);
			
		}
		
		else if (w > 10 && w <=20)
			
		{
			System.out.println("The cost of shipping is $" + 10.5);
			
		}
		
		else 
		{
			System.out.println("The package can not be shipped");
		}
	}
	
	
}
