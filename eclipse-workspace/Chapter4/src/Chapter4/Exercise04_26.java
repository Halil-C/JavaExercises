package Chapter4;

import java.util.Scanner;

public class Exercise04_26 {

	 public static void main(String[] args) {   
		    Scanner input = new Scanner(System.in);
		 
		    System.out.print(
		      "Enter an amount in double, for example 11.56: ");
		    
		    String amount = input.next();
		    int numberOfOneDollars = Integer.parseInt(amount.substring(0, amount.indexOf('.')));
		    int numberOfCents = Integer.parseInt(amount.substring( amount.indexOf('.')+1));
		 
		 
		 
		    int numberOfQuarters = numberOfCents / 25;
		    numberOfCents = numberOfCents % 25;
		 
		    int numberOfDimes = numberOfCents / 10;
		    numberOfCents = numberOfCents % 10;
		 
		    int numberOfNickels = numberOfCents / 5;
		    numberOfCents = numberOfCents % 5;
		 
		    int numberOfPennies = numberOfCents;
		 
		    System.out.println("Your amount " + amount + " consists of"); 
		    System.out.println("\t" + numberOfOneDollars + " dollars");
		    System.out.println("\t" + numberOfQuarters + " quarters ");
		    System.out.println("\t" + numberOfDimes + " dimes"); 
		    System.out.println("\t" + numberOfNickels + " nickels");
		    System.out.println("\t" + numberOfPennies + " pennies");
		  
	 }
}
