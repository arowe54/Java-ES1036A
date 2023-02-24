import java.util.Scanner; // allows program to use Scanner methods
public class SumAll {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in); // instance alllows program to manipulate user inputs
        int sum = 0, input = 0, number = 0;

        System.out.println("Please enter a positive nonzero integer value");
        input = keyboard.nextInt();
        do{
            number++; // increments the number by 1
            sum += number; // adds the number to the sum (ex 1, 2, 3, ...)
        } while (number != input); // repeat while the number does not equal the input
        System.out.println(sum);
    }
}
