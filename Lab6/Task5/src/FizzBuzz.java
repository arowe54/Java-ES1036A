/*
Andrew Rowe
ES1036A-002
251276493
2022-11-11
Lab6
Description:
Takes the input of two numbers for the beginning and end of a closed interval, respectively,
and returns the output of the numbers within this interval,
except if the number is divisible by 3, it outputs Fizz instead,
and if the number is divisible by 5, it outputs Buzz instead,
and if the number is divisible by 3 and 5, it outputs FizzBuzz instead.
 */
import java.util.Scanner; // gets scanner methods
public class FizzBuzz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b = 0;

        a = input.nextInt();
        b = input.nextInt();

        // interval [a,b]
        for (int i = a; i<=b; i++){
            if (i%3 == 0 && i%5 == 0){ // if divisible by 3 and 5
                System.out.println("FizzBuzz");
            } else if (i%3 == 0){ // if only divisible by 3
                System.out.println("Fizz");
            } else if (i%5 == 0){ // if only divisible by 5
                System.out.println("Buzz");
            } else { // if not divisible by 3 or 5
                System.out.println(i);
            }
        } // end for
    } // end main
}
