/*
Andrew Rowe
251276493
Lab7, Task1
Description: Creates a file and saves the given text into it, then prints entire contents of file, first three lines
of file, all of the lines again, then only lines 3 to 5.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FilesDemo {
    public static void main(String[] args) throws IOException {
        FileSave iFile = new FileSave("lines.txt"); // create new file named lines.txt
        // input the following Strings to lines.txt
        iFile.save("1-Lorem ipsum dolor sit amet\n2-Consectetuer adipiscing elit\n" +
                        "3-Sed diam nonummy nibh euismod tincidunt\n4-Ut wisi enim ad minim veniam\n" +
                        "5-Quis nostrud exerci tation ullamcorper\n" +
                        "6-Suscipit lobortis nisl ut aliquip ex ea commodo consequat\n"+
                        "7-Duis autem vel eum iriure dolor in hendrerit\n" +
                        "8-Vel illum dolore eu feugiat nulla facilisis at vero eros\n");
        System.out.println();
        // display lines
        FileDisplay oFile = new FileDisplay("lines.txt");
        oFile.display(); // displays contents of all of iFile
        System.out.println();
        oFile.display(3); // displays lines 1-3
        System.out.println();
        oFile.display(10); // 1-8 (less than 10 lines)
        System.out.println();
        oFile.display(3,5); // displays lines 3 to 5
    }
}
