/*
Done by Andrew Rowe
Student Number 251276493
ES1036A 002
Description:
    Java program that assigns the programmer's name, age, and desired annual pay into String, int, and double variables,
    respectively, then prints them to the console.
 */

public class Task2 {

    public static void main(String[] args){

        // declaring and assigning variables
        String name = "Andrew Rowe";
        int age = 18;
        double annualPay = 100000;

        // prints my name, age, and desired annual income in a printf statement to the console
        System.out.printf("My name is %s, my age is %d and\nI hope to make $%.1f per year.", name, age, annualPay);

    }

}
