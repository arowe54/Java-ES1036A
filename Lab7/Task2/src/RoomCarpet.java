/*
Description:
Finds the price of the carpet in $ per square foot
 */
public class RoomCarpet {
    private RoomDimension size;
    private double carpetCost;

    public RoomCarpet(RoomDimension dim, double cost){
        size = dim;
        carpetCost = cost;
    }
    public double getTotalCost(){
        return size.getArea()*carpetCost; // multiplies the area of the carpet by the cost per square foot
    }
    public String toString(){
        return String.format("Room Dimensions:\n%s\nCarpet Cost: $%.2f", size, getTotalCost());
    }


}
