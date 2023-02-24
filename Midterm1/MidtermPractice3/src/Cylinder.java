public class Cylinder {
    private double radius, height;
    private final double PI = 3.14159;
    public Cylinder(double radius, double height){}
    public void setRadius(double radius){this.radius = radius;}
    public void setHeight(double height){this.height = height;}
    public double getRadius(){return radius;}
    public double getHeight(){return height;}
    public double getVolume(){return PI*radius*radius*height;}
    public double getCurvedSurfaceArea(){return 2*PI*radius*height;}
    public double getTotalSurfaceArea(){return 2*PI*radius*(height+radius);}
}
