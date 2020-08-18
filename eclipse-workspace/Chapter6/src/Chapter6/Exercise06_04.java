package Chapter6;

import java.util.Scanner;

public class Exercise06_04 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		System.out.println("Reverse of " + number + " is " + reverse(number));
	}		

		
		public static int reverse(int number) {

	String reverse = "";
	String n = number + "";
	for (int i = n.length() - 1  ; i >= 0; i--) {
		reverse += n.charAt(i);
	}
	return Integer.parseInt(reverse);
	
}
}