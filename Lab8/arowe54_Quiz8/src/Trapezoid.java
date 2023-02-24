public class Trapezoid {
    private double longSide;
    private double shortSide;
    private double height;

    public Trapezoid(double l, double s, double h){
        super();
        this.longSide = l;
        this.shortSide = s;
        this.height = h;
    }

    @Override
    public double getArea(){return (longSide + shortSide)*height/2.0;}
}
