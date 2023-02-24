public class Student extends Person {
    private int numCourses;
    private Course[] courses;
    private String sNumber;

    public Student(String firstName, String lastName, String sNumber){
        super(firstName, lastName); // call constructor of super class manually
        numCourses = 0;
        courses = new Course[7]; // 0 courses but holds up to 7
        this.sNumber = sNumber;
    }

    public void addCourse (Course aCourse){
        courses[numCourses++] = aCourse;
    }

    public String toString(){
        String info = sNumber + " " + super.toString() + "\n";
        for(int i = 0; i < numCourses; i++){

        }
    }








}
