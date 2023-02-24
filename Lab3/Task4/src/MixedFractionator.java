/*
Andrew Rowe
251276493
ES1036A-002
Program saves a double inputted from the user and returns the number in its whole and fractional parts separately
(kind of like a mixed fraction but with decimals).
 */
import java.util.Scanner; // imports the Scanner class from the java.util library to let us work with user inputs

public class MixedFractionator {
    public static void main(String[] args){

        // defines a scanner object called keyboard which allows the program to manipulate user inputs when called
        Scanner keyboard = new Scanner(System.in);

        // asks user to input any number
        System.out.println("Please input any number.");
        // defines a double called num and defines it the value of the user's next double input
        double num = keyboard.nextDouble();

        // prints the number as a truncated whole number
        System.out.println("The whole parts of this number is " + (num-(num%1)));
        // prints the numbers in the decimal places
        System.out.println("The fractional parts of this number is " + num%1);

    }
}