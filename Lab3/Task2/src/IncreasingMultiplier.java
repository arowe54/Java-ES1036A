/*
Andrew Rowe
251276292
ES1026A-002
Program takes a user input, assigns it to n, and returns ((n+1)*n+2)*n+3
 */
import java.util.Scanner; // imports the scanner class from the jav.util library so we can work with user inputs.

public class IncreasingMultiplier {
    public static void main(String[] args){
        // defines a scanner object called keyboard
        Scanner keyboard = new Scanner(System.in);

        // asks user to input an integer
        System.out.println("Please input an integer.");
        // declares an int named n and saves user input to n.
        int n = keyboard.nextInt();

        // prints the output of performing the math expression on the user input
        System.out.printf("The output of the operation on %d is %d", n, ((n+1)*n+2)*n+3);

    }
}
