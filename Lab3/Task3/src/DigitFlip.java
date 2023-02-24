/*
Andrew Rowe
251276493
ES1036A-002
Program reads a 2 digit user input and returns the number with the 2 digits switched and a "<->" between them.
 */
import java.util.Scanner;

public class DigitFlip {
    public static void main(String[] args){

        // defines a scanner object named keyboard that works with user input when called
        Scanner keyboard = new Scanner(System.in);

        // asks user to input a 2-digit integer
        System.out.println("Please input a two-digit integer");
        // defines an integer named d and assigns it the value of the user's next integer input
        int d = keyboard.nextInt();

        // returns the 2-digit integer with its ones-digit followed by <-> and its tens-digit
        System.out.print(d/10 + "<->" + d%10);

    }
}
