import java.util.Scanner;
public class MagicDatesDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // creates instance of Scanner class
        System.out.print("Please enter a month, day, and 2-digit year as integers: ");

        // creates an instance of the MagicDate class using the month, day, and year provided
        MagicDate date = new MagicDate(input.nextInt(), input.nextInt(), input.nextInt());
        if (date.isMagic()){
            System.out.print("The date is magic!");
        } else{
            System.out.print("The date is not magic.");
        }
    }
}
