package task;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	float celsius;
	double farenheit;


	System.out.print("Enter temperature in Celsius: ");

	celsius = input.nextFloat();

	farenheit = (celsius * 9 / 5) + 32;

	System.out.println();
	System.out.println("Results: ");

	System.out.print(celsius + "°C = " + (float)farenheit + "°F" );

	System.out.println();
	System.out.println();


    }
}
