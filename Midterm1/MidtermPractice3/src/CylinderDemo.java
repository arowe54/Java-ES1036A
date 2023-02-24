import java.util.Scanner;
public class CylinderDemo {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Cylinder userCylinder = new Cylinder(0,0);
        System.out.print("Enter the radius of a cylinder: ");
        userCylinder.setRadius(keyboard.nextDouble());
        System.out.print("Enter the height of a cylinder: ");
        userCylinder.setHeight(keyboard.nextDouble());
        System.out.printf("The cylinder's radius is %.1f\n", userCylinder.getRadius());
        System.out.printf("The cylinder's height is %.1f\n",userCylinder.getHeight());
        System.out.printf("The cylinder's volume is %.14f\n", userCylinder.getVolume());
        System.out.printf("The cylinder's curved surface area is %.14f\n", userCylinder.getCurvedSurfaceArea());
        System.out.printf("The cylinder's total surface area is %.14f\n", userCylinder.getTotalSurfaceArea());
    }
}
