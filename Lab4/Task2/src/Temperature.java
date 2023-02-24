/*
Andrew Rowe
251276493
Task 2
Declares a class called Temperature, which allows the user to convert a temperature given in degrees Fahrenheit to
degrees Celsius and degrees Kelvin by using accessor and mutator methods.
 */
public class Temperature {

    // variable declaration
    // declares a double called ftemp that is privately accessed within the class to store the temperature in Fahrenheit
    private double ftemp;

    // class constructor
    public Temperature(double temperature){
        ftemp = temperature; // stores the parameter when creating an instance of this object to the variable ftemp
    }

    // mutator
    public void setFahrenheit(double Fahrenheit){ // sets the argument in the parameter as a double to ftemp
        ftemp = Fahrenheit;
    }

    // defines accessors
    public double getFahrenheit(){return ftemp;} // returns temp in Fahrenheit. Only one line of code is necessary
    public double getCelsius(){return (ftemp-32)*5/9;} // converts the temperature from Fahrenheit to Celsius
    public double getKelvin(){return (ftemp-32)*5/9 + 273;} // converts the temperature from Fahrenheit to Kelvin

}