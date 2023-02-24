public class Temperature {
    private double ftemp;
    public Temperature(double ftemp){
        this.ftemp = ftemp;
    }
    public void setFahrenheit(double ftemp){this.ftemp = ftemp;}
    public double getFahrenheit(){return ftemp;}
    public double getCelsius(){return 5*(ftemp-32)/9;}
    public double getKelvin(){return 5*(ftemp-32)/9+273;}
}
