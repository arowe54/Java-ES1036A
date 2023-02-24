public class NestedLoops {
    public static void main(String[] args){
        // print five lines with 11 dashes
        for (int i = 0; i < 5; i++){ // runs five times
            // print out eleven characters on one line
            for (int j = 0; j<11; j++){ // runs 11 times
                System.out.print("-"); // prints a dash
            }
            System.out.println(); // fills the rest of the line with empty spaces and moves to next line
        }

        System.out.println();

        // print five lines with a decreasing triangle of dashes
        for (int i = 0; i < 5; i++){ // runs five times
            // print out decreasing amount of characters on each line
            for (int j = 0; j< 5-i; j++){ //
                System.out.print("-"); // prints a dash
            }

            System.out.println(); // fills the rest of the line with empty spaces and moves to next line
        }

        // prints 1 3 5 7 9 (each on their own line)
        for (int k = 1; k<10; k+=2){ // starts at value of one and increases by two each iteration
            for (int i = 0; i<k; i++){
                System.out.print(k); // prints 1 one, 3 threes, 5 fives, etc...
            }
            System.out.println();
        }

        System.out.

        // final combination
        for (int i = 0, k=1; i<5; i++, k+=2){ // prints five lines (combines both loops)
            for (int j = 0; j < 5-i; j++){ // runs 5 times, then decreases run times by one each line
                System.out.print("-"); // prints a dash
            }

            for (int j = 0; j<k; j++){ // prints the message once, then 3 times, then 5 times, increasing by 2 each time
                System.out.print(k); // prints a one, then a three, then a five depending on the parent run
            }
            // makes it symmetrical
            for (int j = 0; j < 5-i; j++){
                System.out.print("-");
            }
            System.out.println(); // move to next line
        }
    }
}