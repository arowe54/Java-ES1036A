/*
Andrew Rowe
251276493
ES1036A
Task1
Creates a class for the cylinder. This gives the ability to return the cylinder's radius, height, volume,
curved surface area, and total surface area using accessors and mutators when being given just it's radius and height.
 */

public class Cylinder {

    // variable declaration
    private double radius, height; // declares 2 doubles called radius and height
    private final double PI = 3.14159; // declares a final double called PI, which holds the value for PI to 6 sig-figs
    // declares a constructor for the Cylinder class
    public Cylinder(){
    }

    // declares mutators (setters)
    public void setRadius(double radius){ // mutator for radius
        this.radius = radius;
    }
    public void setHeight(double height){this.height = height;} // mutator for height, on one line to save space

    // declares accessors (getters)
    public double getRadius(){ // gets the radius
        return radius;
    }

    public double getHeight(){return height;} // returns the height

    public double getVolume(){ // finds volume
        double volume = PI*radius*radius*height;
        return volume;
    }

    public double getCurvedSurfaceArea(){ // returns the area of the curved surface of the cylinder (between the bases)
        double curvedSurfaceArea = 2*PI*radius*height;
        return curvedSurfaceArea;
    }

    public double getTotalSurfaceArea(){ //finds the total surface area
        double totalSurfaceArea = 2*PI*radius*(height + radius);
        return totalSurfaceArea;
    }

}
