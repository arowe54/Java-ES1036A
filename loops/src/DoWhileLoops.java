import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args){
        /*
    do
    {
        statement;
    } while (condition);
    // does statement and repeats after testing condition
     */
        String input;                        // input
        double test1, test2, test3, average; // test scores and average
        char repeat1;                         // condition for while loops
        boolean repeat2;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please give 3 test scores. Prints average.");
        /*
        do{
            System.out.println("Enter all 3 scores: ");
            test1 = keyboard.nextDouble();
            test2 = keyboard.nextDouble();
            test3 = keyboard.nextDouble();

            average = (test1 + test2 + test3)/3.0;
            System.out.println("The average is " + average);

            System.out.println("Enter Y if you want to repeat.");
            input = keyboard.next();
            repeat1 = input.charAt(0);
        } while (repeat1 == 'Y' || repeat1 == 'y'); // must use '' for char
         */

        do{
            System.out.println("Enter all 3 scores: ");
            test1 = keyboard.nextDouble();
            test2 = keyboard.nextDouble();
            test3 = keyboard.nextDouble();

            average = (test1 + test2 + test3) / 3.0;
            System.out.printf("The average is %.2f%%\n", average); // %% shows a %

            System.out.println("Enter true if you want to try again.");
            input = keyboard.next(); // read a string
            repeat2 = keyboard.nextBoolean(); // get a true or false value
        } while (repeat2);

        /*
        // initialize a control variable just in for loop, test a condition, and modify the control variable after test
        for(initialization; test; update){
            statement(s);
        }
         */


        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; 5-i > 0; i++){
            for (int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
