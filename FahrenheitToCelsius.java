/* This program converts the temperature in Fahrenheit to Celsius 
Written by Oscar Valentin Kmit Mikkelsen*/

import java.util.*;

public class FahrenheitToCelsius {

	private static Scanner in;

	public static void main(String[] args) {
		float temperature; 
		in = new Scanner(System.in);
		
		System.out.println("Enter temperature in Fahrenheit");
		temperature = in.nextInt();
		
		temperature = ((temperature - 32) * 5)/9;
		
		System.out.println("Temperature in Celsius = " + temperature);
		
		
		
		
		}

}
