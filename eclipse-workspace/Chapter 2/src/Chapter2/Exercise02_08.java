package Chapter2;
import java.util.Scanner;

public class Exercise02_08 {

	public static void main(String[] args) {
		
		System.out.println("Enter the time zone offset to GMT:");
	
		Scanner input = new Scanner(System.in);
		
		int offset = input.nextInt();
		
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		
		long totalMinutes = totalSeconds / 60;
		
		long totalHours = totalMinutes / 60;
		
		int currentSecond = (int) (totalSeconds % 60);
		
		int currentMinute = (int) (totalMinutes % 60);
				
		int currentHour = (int) (totalHours % 60) + offset;
		
		System.out.println(" The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + ":");
		
	}
	
}
