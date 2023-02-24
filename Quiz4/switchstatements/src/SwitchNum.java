import java.util.Scanner;
import java.util.Random;
public class SwitchNum {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double score;
        char grade;

        Random num = new Random(); // generates a random number
        // nextDouble() return random number as a double within 0.0 to 1.0
        // nextFloat() return float 0.0 to 1.0
        // nextInt() return random number as an int within range of int, -2,147,483,648 to 2,147,483,648
        // nextInt(int n) accepts integer arg n, returns random number as an int within range 0 to n+1 (ex 9 = 1to10)

        System.out.println(num);

        System.out.println("Enter score");
        score = keyboard.nextLine();

        switch(((int) score) / 10 ){
            case 6:
                grade = '0';
                break;
            case 7:
                grade = 'C';
                break;
            case 8:
                grade = 'B';
                break;
            default:

        }

    }


}
