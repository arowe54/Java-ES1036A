public class Inheritance {
    // there are general objects and specialized objects
    // general (ex. Person), specialized (ex. Student, Instructor)
    // inheritance
    /*
    // extend
    public class Student extends Person
    public class Instructor extends Person

    person is superclass / base class
    student and instructor are subclasses / derived classes

    subclass inherits fields and methods from superclass
    student and instructor inherit person methods

    private members of superclass are not inherited

    subclass does not inherit constructor of superclass
    but subclass constructor immediately executes constructor of superclass

    don't extend class to Demo class

    // super
    super();
    super refers to the name of the super class
    super() calls the constructor of the super class with the given argument in the ()
    super should be the first class in the constructor

    can only call an instance of a subclass if there is a super() in the subclass constructor
     */

    /*
    Method overriding
    - subclass methods override superclass methods with the same signature
    ex. toString()
    use @Override just before the subclass method declaration
    use final before in the superclass method declaration to prevent it from being changed by @Override

    if you use @Override without super, and it calls itself using recursion
    super prevents recursion
    recursion = method calls itself forever

    // protected members
    protected members access are somewhere between public and private
    may be accessed by members in a subclass and by methods in the same package of the class
    unlike public, not accessible by all other classes outside the package (sub/super class of member)

    any class derived from the class has unrestricted access to the protected member

    if there is no access modifier, it is given package access by default
    any method in the same package may access the member

    // overriding superclass methods
    overloading can be done within the same class or different classes
    can overload the same method in the same class
    cannot override same method in same class

    overload changes parameter type or order
    @Override does not change anything in method header
     */
    /*
    super class can also be derived from other classes (subclasses of subclasses)
    ex. if PassFailExam is subclass of PassFailActivity, which is a subclass of GradedActivity,
    super(minPassing) calls constructor in PassFailActivity with minPassing as argument
    using setScore(numericScore), it calls method in GradedActivity with parameter of numericScore

    in java, each class can only inherit from one class
     */
    /*
    Polymorphism
    Define a reference variable of different forms
    ex.
    Graded Activity exam = new FinalExam(50, 7);
    exam = new PassFailActivity(70);
    exam = new PassFailExam(100, 10, 70);

    FinalExam, PassFailActivity, and PassFailExam are all subclasses of GradedActivity
    sout println(exam.getScore()); // works
    sout println(exam.getGrade()); // works
    sout println(exam.getPointsEach()); // does not work bc it is a method of the subclass

    if the method is defined in the subclass but not superclass, it will give an error when called
     */
    /*
    Abstract methods
    abstract class is a class with at least one abstract method
    cannot be instantiated
    abstract method is an incomplete method
    in uml diagram, if it is in italics, it is an abstract class

    public abstract class ClassName {
    }

     */
}
public abstract class Student {
    private String name;
    private String idNumber;
    private int yearAdmitted;

    public Student(String n, String id, int year){
        name = n;
        idNumber = id;
        yearAdmitted = year;
    }
    public abstract int getRemainingHours(); // no {}
}
public class CompSciStudent extends Student {
    public CompSciStudent(String n, String id, int year){
        super(n, id, year);
    }
    @Override
    public int getRemainingHours(){
        int remHours;
    }
}

public class CompDemo{
    public static void main(String[] args){
        Student uStudent = new CompSciStudent("Slkfjsdlkfj", "slkjfdsklfj", 120, 343, 123, 40);
    }
}
