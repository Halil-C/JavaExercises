package Chapter6;

import java.util.Scanner;

public class Exercise06_37 {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and a width: ");
        int n = input.nextInt();
        int width = input.nextInt();

        String s = format(n, width);
        System.out.println("The number formatted: " + s);
    }

    public static String format(int number, int width) {

        int size = getNumberSize(number);

        if (size > width) return "" + number;

        StringBuilder s = new StringBuilder();
        s.append(number);

        for (int i = 0; i < width - size; i++) {
            s.insert(0,'0');
        }

        return s.toString();
    }

    public static int getNumberSize(int n) {

        int size = 0;
        while (n > 0) {
            size++;
            n /= 10;
        }
        return size;
    }
	
}
