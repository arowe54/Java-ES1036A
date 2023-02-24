/*
Andrew Rowe
251276493
ES1036A 002
Task2
Asks the user to input the temperature in Fahrenheit, then creates an object of type Temperature with the user's input
for temperature as a parameter. The instance of Temperature is then used in a print statement to convert and display the
user's temperature in degrees Celsius and degrees Kelvin.
 */
import java.util.Scanner; // imports the Scanner class, allowing user inputs to be saved when an instance is created

public class TemperatureDemo {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in); // creates an instance of the Scanner class called keyboard

        // Getting the temperature
        System.out.print("Please input the temperature in Fahrenheit: ");
        Temperature convertTemp = new Temperature(keyboard.nextDouble());
        // creates a temperature object and takes the user's input as a double as a parameter

        // Converting the temperature to Celsius and Kelvin
        System.out.printf("Celsius: %.2f\nKelvin: %.2f", convertTemp.getCelsius(), convertTemp.getKelvin());

    }
}
