import java.util.Scanner;
public class ArraysDemo {
    public static int[] ArrayExpand (int[] oldArray, int size){
        int[] newArray = new int[size]; // creates a new array with the required size
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i]; // copies values of old array to new array
        }

        // return the new array
        return newArray;
    }
    public static void main(String[] args){ // String[] is an array of Strings
      /*
        int lab1 = 10;
        int lab2 = 10;
        int lab3 = 10;
        int lab4 = 8;
        int lab5 = 7;
       */
        Scanner keyboard = new Scanner (System.in);

        // array
        int[] lab = new int[8]; // creates an int array (indices 0-7)
        lab[0] = 10; // int lab1 = 10
        lab[1] = 10;
        lab[2] = 10;
        lab[3] = 9;
        lab[4] = 7; //  int lab5 = 7

        int[] lab2 = {10,10,10,9,7}; // creates the lab array

        // find sum
        int total = 0;
        for (int i = 0; i<5; i++){
            total+= lab2[i]; // add the value at the current index to i
        }
        System.out.println(total);

        String [] var = {"red", "green", "yellow"};
        String allStrings = "";
        for (int i = 0; i<var.length; i++){
            System.out.println(var[i]);
            allStrings += var[i];
        }
        System.out.println(allStrings);
        // how many grades, what are these grades
        System.out.println("How many grades to store?");
        int numGrades = keyboard.nextInt();
        int[] lab3 = new int[numGrades]; // creates an array that has the size of the number of grades

        for (int i = 0; i < numGrades; i++) {
            System.out.println("Enter the value of grade " + (i+1) + ".");
            lab3[i] = keyboard.nextInt();
        }
        int total2 = 0;
        for (int i = 0; i < lab3.length; i++) {
            total2+=lab3[i];
        }
        System.out.println("The average is " + total2/lab3.length + ".");
        // cannot change array sizes
        // can create new arrays and use for loops to copy stuff into it

        int[] biggerArray = ArrayExpand(lab3, lab.length+3);
        for (int i = 0; i < biggerArray.length; i++) {
            System.out.printf(biggerArray[i]);
        }
    }
}
