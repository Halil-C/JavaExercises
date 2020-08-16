package Chapter5;

import java.util.Scanner;

public class Exercise05_48 {
	 public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String s = input.nextLine();

	        String oddChars = "";
	        for (int i = 0; i < s.length(); i++) {

	            if (i  % 2 == 0) {
	                oddChars += s.charAt(i);
	            }
	        }

	        System.out.println(oddChars);
	    }

}
