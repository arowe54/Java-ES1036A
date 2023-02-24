public class ProductionWorker extends Employee { // subclass of Employee
    private int shift;
    private double payRate;
    public final int DAY_SHIFT = 1;
    public final int NIGHT_SHIFT = 2;

    // constructor
    public ProductionWorker(String n, String num, String date, int sh, double rate) {
        super(n, num, date); // calls constructor of parent class (sets parameters to private variables in Employee)
        this.shift = sh;
        this.payRate = rate;
    }
    public ProductionWorker() {super();}

    // mutators/setters
    public void setShift(int s) {this.shift = s;}
    public void setPayRate(double p) {this.payRate = p;}

    // accessors/getters
    public int getShift() {return shift;}
    public double getPayRate() {return payRate;}

    public String toString() {
        String output = "";
        output += String.format("%s", super.toString()); // prints name, employee number, and hire date from employee
        if (shift == DAY_SHIFT) {
            output += String.format("Shift: Day\n");
        } else if (shift == NIGHT_SHIFT) {
            output += String.format("Shift: Night\n");
        } else {
            output += String.format("Shift: Invalid\n");
        }
        output += String.format("Hourly Pay Rate: $%.2f\n", payRate);
        return output;
    }
}