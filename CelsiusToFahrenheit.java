import java.util.*;

public class CelsiusToFahrenheit {

	private static Scanner in;
	
	public static void main(String[] args) {
		float temperature;
		in = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Celsius");
		temperature = in.nextInt();
		
		temperature = temperature * 9/5 + 32; 
		
		System.out.println("Temperature in Fahrenheit = " + temperature);


	}

}
 