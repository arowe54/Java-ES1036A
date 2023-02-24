/*
Andrew Rowe
251276493
ES1036A
Asks the user for the radius and height of the cylinder, creates a object named cylinder (an instance of the cylinder
class), and prints it's radius, height, volume, curved surface area, and total surface area to the console.
 */
import java.util.Scanner; // imports the scanner class from the java.util library, allowing manipulation of user inputs

public class CylinderDemo {

    public static void main(String[] args) { // main method

        // creating objects
        Scanner keyboard = new Scanner(System.in); // creates a Scanner object named keyboard to manipulate user inputs
        Cylinder cylinder = new Cylinder(); // creates an instance of the Cylinder object called cylinder1
        // declaration of variables

        // initialization of radius and height
        System.out.print("Enter the radius of a cylinder: ");
        cylinder.setRadius(keyboard.nextDouble()); // sets the user's input for radius to the cylinder's radius

        System.out.print("Enter the height of a cylinder: ");
        cylinder.setHeight(keyboard.nextDouble()); // sets the user's input for height to the cylinder's height


        // prints the cylinder's radius, height, volume, curved surface area, and total surface area over a few lines
        System.out.printf("The cylinder's radius is %.1f\n",cylinder.getRadius());
        System.out.printf("The cylinder's height is %.1f\n", cylinder.getHeight());
        System.out.printf("The cylinder's volume is %.14f\n", cylinder.getVolume());
        System.out.printf("The cylinder's curved surface area is %.14f\n", cylinder.getCurvedSurfaceArea());
        System.out.printf("The cylinder's total surface area is %.14f", cylinder.getTotalSurfaceArea());
        // the print statements could be written as one print f statement, but that is much messier to read

    }

}
