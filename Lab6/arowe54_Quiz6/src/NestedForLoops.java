/*
Andrew Rowe
ES1036A     Quiz 6
2022-11-11
251276493
Description:
Prints a certain message with nested for loops
 */

public class NestedForLoops {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++) { // prints 5 lines
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
