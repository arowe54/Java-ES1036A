/*
Andrew Rowe
251276493
ES1036A-002 Quiz 3
Program gets a radius and length of a cylinder from user input and returns the cylinder's area and volume
 */
import java.util.Scanner; // imports Scanner class from java.util library, allowing program to work with user inputs

public class CylinderAreaAndVolume {
    public static void main(String[] args){

        // defines a scanner object named keyboard that manipulates user inputs when called
        Scanner keyboard = new Scanner(System.in);

        // declaration of double variables for dimensions of a cylinder
        double radius;
        double length;
        double area;
        double volume;

        System.out.print("Enter the radius and length of a cylinder: "); // asks user to input the radius and length
        // saves the first double input to radius
        radius = keyboard.nextDouble();
        // saves the next double after the radius from user input to length
        length = keyboard.nextDouble();

        area = radius*radius*3.14159; // assume PI is roughly 3.14159
        volume = area*length; // finds the volume from multiplying the area variable and length
        System.out.printf("The area is %.4f\nThe volume is %.1f", area, volume);

        // area and volume could be inputted directly into the print statements, but if they're saved as variables,
        // they can be used for further operations in the future
    }
}
