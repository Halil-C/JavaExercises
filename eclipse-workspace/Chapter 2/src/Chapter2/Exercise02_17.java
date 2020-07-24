package Chapter2;
import java.util.Scanner;

public class Exercise02_17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:");
		
		double temperatureInFahrenheit = input.nextDouble();
		
		System.out.println("Enter the wind speed (>=2) in miles per hour:");
		
		double windSpeed = input.nextDouble();
		
		double windChillTemperature = 35.74 + (0.6215 * temperatureInFahrenheit) - 
												(35.75 * (Math.pow(windSpeed, 0.16))) + 
												(0.4275 * temperatureInFahrenheit * (Math.pow(windSpeed, 0.16)));
		
		System.out.println("The wind chill index is " + windChillTemperature);

		
		

	}
	
	
	
}
