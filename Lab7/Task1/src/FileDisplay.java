import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDisplay {
    private File file;
    public FileDisplay (String fName) throws FileNotFoundException{ // takes the name of a file as an argument
        this.file = new File(fName); // creates a file in FileDisplay that refers to directory of fName
    }
    public void display() throws FileNotFoundException{
        Scanner input = new Scanner(file); // scanner reads file from beginning
        if (!input.hasNext()){ // if file is empty (does not exist)
            System.out.println("The File Does Not Exist");
        } else {
            while (input.hasNext()){
                System.out.println(input.nextLine());
            }
        }
    } // end display
    public void display(int n) throws FileNotFoundException{
        Scanner input = new Scanner(file); // scanner reads file from beginning
        for (int i = 0; i < n; i++) {
            if(input.hasNext()){
                System.out.println(input.nextLine());
            }
        }
    }

    // displays file contents from line number (from) to line number (to)
    public void display(int from, int to) throws FileNotFoundException{
        Scanner reader = new Scanner(file); // scanner reads file from beginning
        for (int i = 0; i<from-1; i++){ // iterates through each line up until (from-1)
            reader.nextLine(); // moves scanner over the line
        }
        for (int i = from-1; i<to; i++){
            if (reader.hasNext()){
                System.out.println(reader.nextLine()); // prints the lines from (from) to (to)
            }
        } // end for loop

    } // end display (from, to)
}
