package Chapter5;

import java.util.Scanner;

public class Exercise05_31 {

	public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double deposit = input.nextDouble();

        System.out.print("Enter annual percentage yield: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200.0;

        System.out.print("Enter maturity period in months: ");
        double numberOfMonths = input.nextInt();

        System.out.print("Months\t\t\tCD Value\n");
        double accountValue = deposit;
        for (int i = 1; i <= numberOfMonths; i++)
        {
            accountValue *= (1.0D + monthlyInterestRate);
            System.out.printf("%5d%20.2f\n", i, accountValue);
        }
    }

	
}
