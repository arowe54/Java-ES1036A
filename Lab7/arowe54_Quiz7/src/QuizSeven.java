/*
Andrew Rowe, arowe54@uwo.ca, 251276493
Quiz 7
Description:
Creates a printwriter and fills it with 10 lines, each line has a random integer from 1 to 100 (inclusive)
Converts to file, reads the file, and prints how many numbers that are a multiple of 5
 */
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class QuizSeven {
    public static void main(String[] args) throws FileNotFoundException{
        // creating objects
        File file = new File("data.txt"); // creates file
        PrintWriter printer = new PrintWriter("data.txt"); // printer prints in file
        Random rand = new Random(); // create an instance of Random Class

        for (int i = 0; i < 10; i++) { // performs loop 10 times
            printer.println(rand.nextInt(100) + 1);
            // creates an integer from 0 to 99 and adds 1 (1-100), on one line in file
        }
        printer.close(); // closer printer
        Scanner reader = new Scanner(file);

        int counter = 0;
        while (reader.hasNextInt()){
            int test = reader.nextInt();
            if (test % 5 == 0){ // if the number being scanned is a multiple of 5
                counter++;
            }
        }
        System.out.println(counter); // prints how any numbers are a multiple of 5 to console
    }
}
