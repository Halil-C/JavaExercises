package Chapter6;

import java.util.Scanner;

public class Exercise06_36 {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        System.out.println("The area of the polygon is " + area(n, side));


    }

    public static double area(int n, double s) {
        return  (n * s * s) / (4 * Math.tan(Math.PI/n));
    }
	
}
