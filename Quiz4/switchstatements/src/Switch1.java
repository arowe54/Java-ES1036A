import java.util.Scanner;
public class Switch1 {
    public static void main(String[] args){
        String input;
        char choice;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter A, B, or C");
        input = keyboard.nextLine(); // saves user input to input
        choice = input.charAt(0); // saves first character of user input to choice

        // to extract the right most digit
        // ex 25
        // left digit: 25/10
        // right digit: 25%10

        //256/10 = 25
        //256%10 = 6


        // && And
        // || Or
        // ! Not

        // switch statement can evaluate char, byte, short, int, or string value and return a decision(s) on that value
        // switch does not accept double
        /*
        switch (test expression){
            case Value_1:
                statement;
                break;
            case Value_1:
                statement;
                break;
            default:
                statement;
         }
         // break statement breaks out of the switch statement and rest does not run, (optional)
         // default statement runs if test expression does not match any case, (optional)
         */
        switch(choice){
            case 'A':
                System.out.println("You chose A");
                break;
            case 'B':
                System.out.println("You chose B");
                break;
            case 'C':
                System.out.println("You chose C");
            default:
                System.out.println("wrong input");
        }
    }
}
