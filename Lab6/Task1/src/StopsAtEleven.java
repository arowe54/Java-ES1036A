import java.util.Scanner; // import Scanner class
public class StopsAtEleven {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in); // creates instance of scanner class, allowing input manipulation
        int length = 0, input = 0; // defines ints for the length of the sequence, as well as the input

        while (input != 11) && input >=0{ // while the input does not equal 11, and is positive
            input = keyboard.nextInt();
            length++; // increment length of the sequence so far by 1
        }
        System.out.println(length-1); // output zero if first input is 11
    }
}
