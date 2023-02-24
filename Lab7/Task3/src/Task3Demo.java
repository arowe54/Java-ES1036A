/*
Andrew Rowe
251276493
Lab 7, Task 3
Takes an array and prints the sum of the values in the array, the average of the values, the highest value, and the
array in reverse.
 */
import java.util.Arrays; // gives program Array methods
public class Task3Demo {
    public static void main(String[] args){
        double[] boringL1 = {3.0, 2.4, 6.0, 2.0, 4.0, 5.1, 7.2};
        // prints info about the array
        System.out.printf("Processing the array: %s\nTotal: %.1f\nAverage: %.2f\nHighest Value: %.1f\n" +
                "Array Reverse:%s",
                Arrays.toString(boringL1),
                SequenceOperations.getTotal(boringL1),
                SequenceOperations.getAverage(boringL1),
                SequenceOperations.getHighest(boringL1),
                Arrays.toString(SequenceOperations.getReverse(boringL1)));
    }
}
