public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14159;

    // constructor
    public Circle (double r){
        super(); // call constructor of Shape (empty)
        this.radius = r;
    }

    @Override
    public double getArea(){return PI*radius*radius;} // A = PI*r^2

    // toString()
    public String toString(){return String.format("I am a circle shape of area: %.2f", getArea());}
}
