import java.util.Scanner;
import java.util.Calendar;


public class IntroductionMyself {
    public static void main(String[] args) {
        final String MY_NAME; // this is a constant variable
        int yearOfBirth;

        int age;
        int currentYear;

        Scanner keyboard = new Scanner(System.in);

        // gets the current year from Calendar class
        currentYear= Calendar.getInstance().get(Calendar.YEAR);

        // asks user to input name
        System.out.println("Enter Your Name.");
        MY_NAME = keyboard.nextLine();

        // saves the users year of birth
        System.out.println("Enter your year of birth");
        yearOfBirth = keyboard.nextInt();

        keyboard.nextLine();

        System.out.println(Math.pow(age, 3));
        System.out.println(Math.sqrt(age));

        // .next reads until a space
        // .nextLine reads the line

        // calculates the value of the age
        age = currentYear - yearOfBirth;

       // System.out.print("My name is "+ MY_NAME +", I am "+ age +" years old.");
        System.out.printf("%s is %20s I am %-15d years old.", "my name", MY_NAME,age);
    }
}
