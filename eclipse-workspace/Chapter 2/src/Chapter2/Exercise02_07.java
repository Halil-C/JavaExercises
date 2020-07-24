package Chapter2;
import java.util.Scanner;

public class Exercise02_07 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of minutes:");
		
		Scanner input = new Scanner(System.in);
		
		int minutes = input.nextInt();
		
		int hours = minutes / 60;
		
		int days = hours / 24;
		
		int years = days / 365;
		
		int remainingdays = days - (years * 365);
		
		System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingdays + " days ");
		
		
		
	}
}
