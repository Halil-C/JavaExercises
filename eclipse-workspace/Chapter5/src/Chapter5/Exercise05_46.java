package Chapter5;

import java.util.Scanner;

public class Exercise05_46 {
	
	 public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String s = input.next();
	        String reverse = "";
	        for (int i = s.length() - 1; i >= 0; i--) {

	            reverse += s.charAt(i);
	        }
	        System.out.print(s + " in reverse is " + reverse);

	    }


}
