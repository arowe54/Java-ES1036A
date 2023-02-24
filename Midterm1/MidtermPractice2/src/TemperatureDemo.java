import java.util.Scanner;
public class TemperatureDemo {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the Fahrenheit temperature: ");
        Temperature userTemp = new Temperature(keyboard.nextDouble());
        System.out.printf("Celsius: %.2f\n", userTemp.getCelsius());
        System.out.printf("Kelvin: %.2f", userTemp.getKelvin());
    }
}
