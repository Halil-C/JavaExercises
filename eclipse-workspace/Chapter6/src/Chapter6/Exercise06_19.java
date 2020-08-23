package Chapter6;

import java.util.Scanner;

public class Exercise06_19 {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 sides of a triangle: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        if (isValid(s1, s2, s3)) {
            System.out.println("This is a triangle! area = " + area(s1, s2, s3));
        } else {
            System.out.println("Sorry, you entered an invalid triangle...");
        }
    }
	
	public static boolean isValid(double side1, double side2, double side3) {
			boolean valid =
				side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
			return valid;
		}
	
	public static double area(double side1, double side2, double side3) {
			double s = (side1 + side2 + side3) / 2;
			return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		}
}
