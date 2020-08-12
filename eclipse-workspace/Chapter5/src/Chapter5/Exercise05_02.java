package Chapter5;

import java.util.Scanner;

public class Exercise05_02 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	final int NUMBEROFQUESTIONS = 10;
	
	int correctAnswers = 0;
	int count = 0;
	
	long startTime = System.currentTimeMillis();

	String output = "";
	
	while (count < NUMBEROFQUESTIONS) {
		
		int number1 = 1+ (int)(Math.random() * 15);
		int number2 = 1+ (int)(Math.random() * 15);
		
		System.out.println("What is the total of " + number1 + " + " + number2 + " ? ");
		
		int answer = input.nextInt();
		
		if (answer == number1 + number2)
		{
			System.out.println("You are correct!");
			correctAnswers++;
		}
		else {
			System.out.println("Your answer is wrong.\n" + number1 + "+" + number2 + " ? ");
		}
		count++;
		
		output += "\n" + number1 + "+" + number2 + "=" + answer + 
				((number1 + number2 == answer) ? " correct" : " wrong");
		
		}
	long endTime = System.currentTimeMillis();
	long testDuration = endTime - startTime;
	
	System.out.println("The number of correct answers " + correctAnswers + 
			"\nTest duration was " + testDuration / 1000 + " seconds\n" + output );
	}
}
