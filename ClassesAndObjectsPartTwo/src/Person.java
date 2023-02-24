public class Person {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private int age;
    private String emailAddress;

    private Address personAddress;

    private int numOfCars; // to hold the actual number of cars
    private Car[] cars; // no data type of Car yet so does not initialize

    public Person(){
        numOfCars = 0;
        cars = new Car[10];
    }

    // aggregation
    // using external class to define meaning inside internal class
    // creating an instance of one class as a reference in another class

    public void setFirstName (String fName){this.firstName = fName;}
    public void setLastName(String lName){this.lastName = lName;}
    public void setYearOfBirth(int yOB){this.yearOfBirth = yOB;}
    public void setEmailAddress(String emailAddress){this.emailAddress = emailAddress;}
    public void setPersonAddress(Address personAddress){this.personAddress = personAddress;}

    public String getFullName(){return firstName + " " + lastName;}
    public int getAge(){return age;}

    public void addCar(Car aCar){
        cars[numOfCars++] = aCar; // add car to first index of cars array
        // increase numOfCars by one so the next time addCar is called, aCar is saved to the next element in the array
    }




    public String toString(){
        String info;
        info = String.format("%20s %s\n%20s %s\n%20s %d",
                "Full Name: ", getFullName(),
                "Email Address: ", emailAddress,
                "Age", getAge());
        info += personAddress; // adds the toString of Address
        info += "\n\nCar information\n";
        info += "    ===============\n";

        for (int i = 0; i < numOfCars; i++){
            info += (i+1) + ": " + cars[i] + "\n"; // adds the car of index i in cars to return String
        }
        return info;


    }




}
