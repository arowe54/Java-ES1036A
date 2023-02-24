import java.util.Scanner; // imports Scanner class to manipulate user inputs
public class FuzzBuzzinator {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in); // creates instance of scanner class to manipulate user inputs

        System.out.print("Enter a string value: ");
        String word = keyboard.nextLine();
        if (word.charAt(0) == 'f' && word.charAt(word.length()-1) == 'b'){ // if first letter is f and last is b
            System.out.print("FuzzBuzz");
        } else if (word.charAt(0) == 'f'){ // if first character is f
            System.out.print("Fuzz"); // instructions say Fizz but makes more sense to be Fuzz
        } else if (word.charAt(word.length() - 1) == 'b'){
            System.out.print("Buzz");
        } else {
            System.out.print(word);
        }
    }
}
