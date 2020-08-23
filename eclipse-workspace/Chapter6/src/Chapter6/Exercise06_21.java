package Chapter6;

import java.util.Scanner;

public class Exercise06_21 {

	public static final int INVALID_KEY = -1;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        s = reformatNumber(s);
        System.out.println(s);

    }

    public static String reformatNumber(String s) {

        StringBuilder numberS = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (isNumeric(ch)) numberS.append(ch);

            else if (isLetter(ch)) numberS.append(getNumber(ch));

            else if (isLetter(ch, '-')) numberS.append(ch);

        }
        return numberS.toString();
    }
    public static boolean isNumeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

    public static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    public static boolean isLetter(char ch1, char ch2) {
        return ch1 == ch2;
    }

    public static int getNumber(char ch) {

        ch = Character.toUpperCase(ch);

        if (ch >= 'A' && ch <= 'O') {
            int number = 2; // where 'A' start
            int n = ch - 'A';
            number += (n / 3);
            return number;
        }

        if (ch >= 'P' && ch <= 'S') return 7;
        if (ch >= 'T' && ch <= 'V') return 8;
        if (ch >= 'W' && ch <= 'Z') return 9;

        return INVALID_KEY;

    }
}
