/*
Class can read a file given as a string in the parameter and return whether a given name is in the file for popular
boy's/girl's names.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; // methods let program read files
public class KidsPopularName {
    private String[] kidsNames; // declares a string array
    private String fileName; // declares a string

    public KidsPopularName(String fileName) throws FileNotFoundException{
        this.fileName = fileName;
        this.kidsNames = new String[getNumNames()]; // # of indices in kidsNames == number of lines in fileName
        fillNames();
    }
    // find size (number of lines) of the file
    private int getNumNames() throws FileNotFoundException{
        // scanner must read file with the same name as fileName
        // create file with same name as fileName
        File iFile = new File(fileName); // creates file with same name as fileName
        Scanner translator = new Scanner(iFile); // scanner reads iFile
        int length = 0;
        while (translator.hasNext()){ // while there is something to read
            translator.nextLine(); // move scanner to next line/name
            length++; // increment length by 1
        }
        return length; // returns length 1 bc fileName is a string not a file
    }

    // read the names from the file and assign names to the array
    private void fillNames() throws FileNotFoundException{
        File iFile = new File(fileName); // creates file with same name as fileName
        Scanner translator = new Scanner(iFile); // scanner reads fileName
        for (int i = 0; i<getNumNames(); i++){ // iterates through each index
            this.kidsNames[i] = translator.nextLine(); // saves each name to its own index
        }
    }

    /*
    It would be easier to put the scanner object in the constructor but doesn't follow UML diagram
     */

    public boolean isPopularName(String name) throws FileNotFoundException{
        // searches for name within kidsNames
        boolean isFamous = false;
        for (int i = 0; i<getNumNames(); i++){ // search through fileName
            if (kidsNames[i].equalsIgnoreCase(name)){ // if the value of name at the current index == name
                isFamous = true;
            }
        }
        return isFamous;
    }



}
