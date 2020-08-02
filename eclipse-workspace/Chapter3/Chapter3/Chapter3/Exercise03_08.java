package Chapter3;

import java.util.Scanner;

public class Exercise03_08 {

public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter three integers:");
	
	int integer1 = input.nextInt();
	int integer2 = input.nextInt();
	int integer3 = input.nextInt();
	
	int temp = 1;
	
	if(integer2 < integer1 || integer3 < integer1);
		{
			
			if(integer2 < integer1);
			{
				temp = integer1;
				integer1 = integer2;
				integer2 = temp;
		}
			if(integer3 < integer1);
			{
				temp = integer1;
				integer1 = integer3;
				integer3 = temp;
								
			}
		}
	
	if(integer3 < integer2);
	{
		temp = integer2;
		integer2 = integer3;
		integer3 = temp;
		
		
	}
	
	System.out.println(integer1 + " " + integer2 + " " +integer3);
	
}
	
	
}
