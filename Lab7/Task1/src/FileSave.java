import java.io.File; // import the ability to create files
import java.io.FileNotFoundException;
import java.io.FileWriter; // import the ability to add lines to files
import java.io.IOException;

public class FileSave {
    private FileWriter input;

    // constructor
    public FileSave (String fName) throws IOException {
        File fileName = new File(fName); // creates an empty file with the name of the String parameter
        input = new FileWriter(fileName); // inputs values into file when called
    }
    public void save (String line) throws IOException{
        input.append(line); // concatenates the String param// eter to the file and fills rest of line with empty space
        input.close(); // closes printWriter
    }
}
