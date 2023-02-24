import java.util.Scanner; // allows program to read user input
/*
Andrew Rowe
251276493
Lab7, Task 2
Carpet Calculator finds the price per square foot, length, and width of the carpet from user input,
then prints the dimensions of the carpet, as well as the total price.
 */

public class CarpetCalculator {
    public static void main(String[] args){
        double price = 0;
        double length = 0;
        double width = 0;
        Scanner input = new Scanner(System.in);
        RoomDimension ground;
        RoomCarpet carpet;

        // enter cost per square foot and dimensions
        System.out.print("Enter the price per square foot: ");
        price = input.nextDouble();
        System.out.print("Enter the length of the room: ");
        length = input.nextDouble();
        System.out.print("Now enter the width of the room: ");
        width = input.nextDouble();

        ground = new RoomDimension(length, width);
        carpet = new RoomCarpet(ground, price); // creates the carpet

        System.out.print(carpet);
    }
}
