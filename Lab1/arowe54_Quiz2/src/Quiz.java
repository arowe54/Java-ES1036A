/*
Andrew Rowe
251276493
Description:
Prints my name and that I am taking the ES1036A course, section 002.
*/
public class Quiz {
    public static void main(String[] args){
        // declaring variables
        String courseName;
        String studentName;
        int section;

        // assigning variables
        courseName = "ES1036A";
        studentName = "Andrew Rowe";
        section = 2;
        // printing my name, course, and section to the console using a printf statement
        System.out.printf("My name is %s, I am taking the %s course section 00%d.", studentName, courseName, section);
    }
}
