/*
prints a square from a given length
 */

import java.util.Scanner;
public class SquarePrinter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int length, counter;

        System.out.print("Enter the length of the square: ");
        length = input.nextInt();

        counter = 0;
        while (counter < length*length){ // height equal to the length
            System.out.print("*"); // infinite loop
            counter++; // helps to break out of loop
            if (counter % length == 0){ // when the counter is equal to the length
                System.out.println(); // goes to next line
            }
        }





    }
}
