/*
Finds the dimensions of the carpet (length, width, and area)
 */
public class RoomDimension {
    // room dimensions
    private double length = 0;
    private double width = 0;

    public RoomDimension (double len, double w){
        this.length = len;
        this.width = w;
    }
    public double getArea(){
        return length*width; // A = lw
    }
    public String toString(){
        return String.format("Length: %.1f Width: %.1f Area: %.1f", length, width, getArea()); // prints dimensions
    }


}
