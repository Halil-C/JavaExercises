package Chapter6;

import java.util.Scanner;

public class Exercise06_22 {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer number: ");
        long num = input.nextLong();
        System.out.println("The square root of "+num +" is " +sqrt(num));
    }

    public static double sqrt(long n) {

        double accuracy = 0.00000000001;
        double positive;
        double lastGuess;

        double nextGuess = 1;
        do {
             lastGuess = nextGuess;
             nextGuess = (lastGuess + (n / lastGuess)) * 0.5;

              positive = (nextGuess - lastGuess > 0) ? nextGuess - lastGuess : lastGuess - nextGuess;
        } while (positive > accuracy);

        return lastGuess;
    }
	
}
