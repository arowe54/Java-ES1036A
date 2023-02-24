import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in); // creates an instance of the scanner class

        System.out.print("Please enter your integer: ");

        if (keyboard.nextInt() % 2 == 0){ // if the number is even (no remainder when integer divided by 2)
            System.out.print("EVEN");
        }
        else {
            System.out.print("ODD"); // if the number is not even it must be odd
        }
    }
}
