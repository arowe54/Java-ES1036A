import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File; // creates files
import java.util.Scanner;

public class PersonDemo {
    public static void main(String[] args) {
        Person me = new Person();
        Person you = new Person();

        // create a file for output
       // PrintWriter pw = new PrintWriter("oFile.txt");

        Address address = new Address();

        me.setFirstName("Andrew");
        me.setLastName("Rowe");
        me.setYearOfBirth(2004);
        me.setEmailAddress("arowe54@uwo.ca");

        you.setFirstName("Andrew");
        you.setLastName("Rowe");
        you.setYearOfBirth(2004);
        you.setEmailAddress("arowe54@uwo.ca");

        address.setProvince("Ontario");
        address.setCity("London");
        address.setCountry("Canada");

        me.setPersonAddress(address);

        Car car1 = new Car("Honda", "Civic", 2022);
        Car car2 = new Car("Chevrolet", "Camaro", 2014);

        // I have 2 cars
        me.addCar(car2);
        me.addCar(car1);

        you.addCar(car1);

        if (me == you){
            System.out.println("True!");
        } else{
            System.out.println("False!");
        } // me and you are not same location in memory, so prints false

        if (me.equals(you)){
            System.out.println("True!");
        } else{
            System.out.println("False!");
        } // still prints false because .equals only compares strings
        // must override equals method

        /*
        pw.println(me);
        pw.println();
        pw.println(you);

        pw.close();

        File iFile = new File("iFile.txt"); // creates a new file for input that is a .txt file
       // Scanner keyboard = new Scanner(System.in); // input reads from the keyboard (system)
        Scanner input = new Scanner(iFile); // input reads from File

        // displays all of the data in File
        while (input.hasNext()){ // while the input has something to read
            String line = input.nextLine(); // saves the line of code to line
            System.out.println(line); // print the line in the fine
        }

         */
        System.out.println(me);

    }
}
