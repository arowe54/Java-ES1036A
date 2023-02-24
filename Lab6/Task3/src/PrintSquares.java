/*
Andrew Rowe
ES1036A-002
Lab6
2022-11-11
Description:
Program asks user to input a positive nonzero integer, then program returns all numbers squared that are less than or
equal to that number.
 */

import java.util.Scanner; // imports scanner class
public class PrintSquares {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in); // allows manipulation of user inputs
        int input = 0;
        int number = 1; // intializes number to 1 so it doesn't print 0 in first iteration

        System.out.println("Please enter a positive nonzero integer value N");
        input = keyboard.nextInt();

        do{
            if ((number+1)*(number+1) <= input){
                System.out.print(number*number + ", ");
            } else { // if the next possible number squared in the do-while loop is greater than the input
                System.out.print(number*number + "."); // creates a period instead of a comma
            }
            number++; // increments number by 1
        } while (number*number <= input); // repeat while the number squared is not bigger than the input
    }
}
