package Chapter5;

import java.util.Scanner;

public class Exercise05_45 {
	
	public static void main(String[] strings) {

        double total = 0.0;
        double squareTotal = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        for (int i = 0; i < 10; i++) {
            double number = input.nextDouble();
            total += number;
            squareTotal += Math.pow(number, 2.0);
        }
        double deviation = Math.pow((squareTotal - total * total / 10.0) / 9.0, 0.5);
        double mean = total / 10.0;

        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + deviation);
    }

}
