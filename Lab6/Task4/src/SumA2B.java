/*
Andrew Rowe
ES1036A
Lab6
2022-11-11
251276493
Description:
Asks user to input 2 integer values a and b and then uses a for loop to print the sum of all integers a to b,
while a < b.
 */
import java.util.Scanner; // allows program to use scanner methods
public class SumA2B {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in); // allows program to manipulate user inputs.
        int a, b, sum = 0;

        System.out.println("Please enter 2 integers.");
        a = keyboard.nextInt(); // first int
        b = keyboard.nextInt(); // second int
        for (int i = a; i<=b; i++){ // runs the loop if a<=b, then increments i by 1
            sum += i;
        }
        System.out.println(sum); // prints sum of integers from a to b
    }
}
