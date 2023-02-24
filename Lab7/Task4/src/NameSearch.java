/*
Andrew Rowe
251276493
Lab 7, Task 4
Description:
User inputs a kid name and program prints to console whether it is a popular boy's or girl's name.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) throws FileNotFoundException {
        KidsPopularName boyNames = new KidsPopularName("BoyNames.txt");
        KidsPopularName girlNames = new KidsPopularName("GirlNames.txt");
        Scanner keyboard = new Scanner(System.in); // lets the program read user input
        String userName;

        System.out.print("Enter a kid name: ");
        userName = keyboard.nextLine();
        if (boyNames.isPopularName(userName)){ // if it is a popular boy name
            System.out.println(userName + " is one of the most popular boy's names.");
        } else if (girlNames.isPopularName(userName)){ // if it is a popular girls name
            System.out.print(userName + " is one of the most popular girl's names.");
        } else { // if it is not a popular boy/girl name
            System.out.println("It is not one of the most popular kid's names.");
        }

    }


}
