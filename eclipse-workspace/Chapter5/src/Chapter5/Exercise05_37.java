package Chapter5;

import java.util.Scanner;

public class Exercise05_37 {

	public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        String binaryString = "";
        while (number >= 1) {
            if (number % 2 == 0) {
                binaryString = "0" + binaryString ;
            } else {
                binaryString = "1" + binaryString ;
            }
            number /= 2;
        }
        System.out.println(binaryString);
    }
	
}
