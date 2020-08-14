package Chapter5;

import java.util.Scanner;

public class Exercise05_14 {

	  public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter first integer number: ");
	        int num1 = input.nextInt();
	        System.out.print("Enter second integer number: ");
	        int num2 = input.nextInt();
	        input.close();

	        int denominator = (num1 > num2) ? num2 : num1;

	        for (; denominator > 0; denominator--)
	            if (num1 % denominator == 0 && num2 % denominator == 0) break;

	        System.out.println("Greatest common denominator of " + num1 + " and " + num2 + " is " + denominator);
	  }
}
