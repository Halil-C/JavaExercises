package Chapter5;

import java.util.Scanner;

public class Exercise05_38 {

	 public static void main(String[] strings) {

	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int number = input.nextInt();

	        String hexString = "";
	        while (number > 0) {
	            int digit = number % 16;

	            if (digit == 15)
	                hexString = "F" + hexString;
	            else if (digit == 14)
	                hexString = "E" + hexString;
	            else if (digit == 13)
	                hexString = "D" + hexString;
	            else if (digit == 12)
	                hexString = "C" + hexString;
	            else if (digit == 11)
	                hexString = "B" + hexString;
	            else if (digit == 10)
	                hexString = "A" + hexString;
	            else
	                hexString = digit + hexString;

	            number = number / 16;
	        }
	        System.out.println(hexString);
	    }
	
}
