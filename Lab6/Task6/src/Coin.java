/*
Andrew Rowe
ES1036A
251276493
2022-11-11
Lab6 Task 6
Description:
Coin class creates a coin, with the option of tossing it and getting either heads (0) or tails (1).
 */
import java.util.Random; // allows program to use methods from Random
public class Coin {
    private String sideUp;

    // Class Constructor
    public Coin(){
        toss();
    }
    public void toss(){
        Random rand = new Random(); // creates an instance of the random class, so program can generate random numbers
        if (rand.nextInt(2) == 0){ // creates a random integer from 0 to 1, and if it is equal to 0
            sideUp = "heads";
        } else { // if it is 1
            sideUp = "tails";
        }
    }
    public String getSideUp(){return sideUp;}
}
