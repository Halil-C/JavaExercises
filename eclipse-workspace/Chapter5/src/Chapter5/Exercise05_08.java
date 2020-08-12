package Chapter5;

import java.util.Scanner;

public class Exercise05_08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int highestScore = 0;
		String highestScorerName = "";
		
		System.out.println("Enter the number of students:");
		
		int numberOfStudents = input.nextInt();
		
		System.out.println("Enter each student's name and score:");
		
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print(
				"Student: " + (i + 1) +
				"\nName: ");
			String name = input.next();
			System.out.print(
				"Score: ");
			int score = input.nextInt();

			if (score > highestScore)
			{
				highestScore = score;
				highestScorerName = name;
			}

		}

		System.out.println("Student with the highest score: " + highestScorerName);
		
		
	}

}
