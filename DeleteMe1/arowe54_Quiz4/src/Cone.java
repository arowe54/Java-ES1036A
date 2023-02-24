/*
Andrew Rowe
251276493
Quiz 4 Classes and Objects

 */
public class Cone {

    // variable declaration and initialization
    private final double PI = 3.14159;
    private double radius, height, slantHeight;

    // constructor
    public Cone(double radius, double height){
    }

    // mutator for the radius
    public void setRadius(double radius){this.radius = radius;}

    // accessors
    public double getRadius(){return radius;} // gets the radius

    // calculates and returns the volume from the standard equation for volume
    public double getVolume(){return PI * radius * radius * height * (1.0/3);}
    public double getSurface(){
        slantHeight = Math.sqrt(radius*radius + height*height);
        return PI * radius * (slantHeight + radius);
    }




}
