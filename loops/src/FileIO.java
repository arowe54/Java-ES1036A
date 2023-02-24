// practicing FileIO operations
import java.io.FileNotFoundException; // catches it
import java.io.FileWriter;
import java.io.PrintWriter;
public class FileIO {
    public static void main(String[] args) throws FileNotFoundException { // throws it
        // if you use throws IOException , it throws everything else instead of just File
        //Open Text File
        PrintWriter output = new PrintWriter("MyOutput.txt");

        // printing stars
        /*
        for (int counter = 0; counter < 5; counter++){

        }
         */
        for (int i = 0; i < 5; i++) { // fori press tab (like sout press tab is System.out.println();
            // prints a line of code
            for (int j = 0; j < 5; j++) {
                output.print("*"); // prints in file
            }
            output.println(); // prints in file
        }
        // close text file
        output.close();

    }
}
