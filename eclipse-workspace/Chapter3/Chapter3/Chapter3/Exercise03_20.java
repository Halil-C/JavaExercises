package Chapter3;

import java.util.Scanner;

public class Exercise03_20 {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:");
		
		double temperatureInFahrenheit = input.nextDouble();
		
		System.out.println("Enter the wind speed (>=2) in miles per hour:");
		
		double windSpeed = input.nextDouble();
		
		double windChillTemperature = 35.74 + (0.6215 * temperatureInFahrenheit) - 
												(35.75 * (Math.pow(windSpeed, 0.16))) + 
												(0.4275 * temperatureInFahrenheit * (Math.pow(windSpeed, 0.16)));
		
		if (temperatureInFahrenheit < -58 || temperatureInFahrenheit > 41)
			
			System.out.println("The temperature is invalid");
		
		 if (windSpeed < 2)
			System.out.println("The wind speed is invalid");
		
		else {
		System.out.println("The wind chill index is " + windChillTemperature);
		}
		
		

	}
	
	
	
}
