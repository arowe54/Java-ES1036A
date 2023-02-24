/* Andrew Rowe
251276493
ES1036A-002
Program defines a method that takes user input, saves them to int variables, and returns the sum of the squares of each
input to the console.
*/

import java.util.Scanner;

public class UsingInputs {
    public static void main(String[] args){

        // define a Scanner object called keyboard
        Scanner keyboard = new Scanner(System.in);

        // reads an integer value from the standard input and assigns it to an int named a
        System.out.println("Please input the first integer.");
        int a = keyboard.nextInt();

        // assigns a second integer value from the standard input to an int named b
        System.out.println("Please input the second integer");
        int b = keyboard.nextInt();

        System.out.print("The sum of the squares of these integers is " + (a*a + b*b)); // prints the sum of the squares

    }
}
