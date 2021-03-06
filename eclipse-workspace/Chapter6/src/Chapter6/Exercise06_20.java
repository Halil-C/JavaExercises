package Chapter6;

import java.util.Scanner;

public class Exercise06_20 {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("The number of letters inside the string is: " + countLetters(s));
    }
    public static int countLetters(String s) {

        int letterCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isLetter(s.charAt(i))) letterCount++;
        }
        return letterCount;
    }

    public static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
	
}


