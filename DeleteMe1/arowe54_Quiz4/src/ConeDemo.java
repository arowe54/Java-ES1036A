/*
Andrew Rowe
251276493
ES1036A 002
Quiz 4
Creates a cone from a given radius and height and finds the volume and surface area
 */
import java.util.Scanner; // imports the Scanner class from the java.util library, letting program save user inputs
public class ConeDemo {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in); // Scanner object called keyboard allows program to use user inputs
        double radius, height;

        // asking for the radius and height
        System.out.print("Enter the radius of the cone base: ");
        radius = keyboard.nextDouble();
        System.out.print("Enter the height of the cone: ");
        height = keyboard.nextDouble();

        // creating the Cone object
        Cone myCone = new Cone(radius, height);
        // saves the user's input for radius and height to their respective variables

        System.out.printf("The cone's volume is %.13f\n", myCone.getVolume());
        System.out.printf("The cone's surface is %.14f", myCone.getSurface());
    }

}
