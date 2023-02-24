import java.util.Scanner; // imports Scanner class
public class IsLeapYear {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in); // creates a scanner object named keyboard
        int year;

        System.out.print("Enter the year: ");
        year = keyboard.nextInt(); // saves the year to year

        if (year % 4 != 0 ){ // if the year is not divisible by 4
            System.out.print("NOT A LEAP YEAR"); // it is not a leap year
        } else if (year % 100 != 0){ // if the year is divisible by 4 but not 100
            System.out.print("A LEAP YEAR"); // it is a leap year
        } else if (year % 400 == 0) { // if the year is divisible by 4 and 100 and is also divisible by 400
            System.out.print("A LEAP YEAR");
        } else {
            System.out.print("NOT A LEAP YEAR");
        }
    }
}
