public class Person {
    // define class variables
    // automatically assigns the value of null to these data types
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int yearOfBirth;

    // if it is a numeric based data type with no assigned value, it has a value of 0
    // if it is a class based data type with no assigned value, it is assigned a value of null

    // constructor (used to create the object
    // constructors do not return anything, including void
    // statement that initializes the code in your class
    // this is the default class constructor
    public Person() {
        yearOfBirth = 2004; // assigns default value of 2004 to yearOfBirth instead of 0
        firstName = "Unknown";
        lastName = "Unknown";
    } // implicitly exists in code if you forget to add it

    // constructor with parameters
    public Person(String fName, String lName){
        firstName = fName;
        lastName = lName;
    }
    public Person(String lName){
        lastName = lName;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void setFirstName(String firstName){ // good to initialize it with the same name
        this.firstName = firstName;
    }

    /*
    Data Encapsulation
    private variables cannot be used outside of the class
    private variables can only be accessed through methods called accessors and mutators (getters and setters)
     */
    // each method should have method head and method body, with parameters.

    // mutator methods, gives the method a value, setters
    public void setFirstName(String fName){ // recieve data from calling class and sets it to a local variable fName
        // public because it can be accessed outside the class
        // void because it is not returning a value
        firstName = fName; // assigns the user input to the variable firstName
    }

    public void setLastName(String lName){
        lastName = lName;
    }

    public void setEmailAddress(String eAddress){
        emailAddress = eAddress;
    }

    public void setYearOfBirth(int birthYear){
        yearOfBirth = birthYear;
    }

    // accessor methods, reads the method and sends it outside the class, getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public String getEmailAddress(){
        return emailAddress;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }


    public int getAge(){
        return 2022-yearOfBirth;
    }

    /*
    stages
    Infant = 0-1 yr
    Toddler = 2-4 yrs
    Child = 4-12 yrs
    Teen = 13-19 yrs
    Adult = 20-39 yrs
    Middle Age Adult = 40-59 yrs
    Senior Adult = 60+
     */
    public String getAgeStage(){
        String stage;
        if (getAge() <= 1){
            stage = "Infant";
        } else if (getAge() <= 4){
            stage = "Toddler";
        } else if (getAge() <= 12){
            stage = "Child";
        } else if (getAge() <=19){
            stage = "Teen";
        } else if (getAge() <= 39){
            stage = "Adult";
        } else if (getAge() <= 59){
            stage = "Midle Age Adult";
        } else {
            stage = "Senior Adult";
        }

        return stage;
    }

}