/*
Description:
Step 1: Creates a coin (an instance of the coin class) and shows the initial side facing up.
Step 2: Tosses the coin and shows the side facing up
Step 3: Repeat Step 2 Ten Times
Step 4: Prints the total heads and total tails called out of the 10 tosses.
 */

public class CoinTossSimulator {
    public static void main(String[] args){
        Coin dime = new Coin(); // creates an instance of the coin class named dime
        int heads = 0; // total number of heads
        int tails = 0; // num tails

        System.out.printf("The side initially facing up: %s\n", dime.getSideUp());
        System.out.println("Now I will toss the coin 10 times.");

        for (int i=0; i<10; i++){ // runs 10 times
            dime.toss(); // toss the coin
            System.out.printf("Toss:   %s\n", dime.getSideUp()); // displays the side facing up
            if (dime.getSideUp() == "heads"){ // if its heads
                heads++; // increment total heads by 1
            } else { // if tails
                tails++;
            }
        } // end for loop
        System.out.printf("Total Heads: %d\nTotal Tails: %d", heads, tails);
    }
}
