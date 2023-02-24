public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double l, double w){
        super();
        this.length = l;
        this.width = w;
    }

    @Override
    public double getArea(){return length*width;}

    public String toString(){return String.format("I am a rectangle shape of area: %.2f", getArea());}
}
