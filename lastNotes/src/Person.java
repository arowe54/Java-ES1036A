public class Person {
    private String firstName;
    private String lastName;

    // class constructor
    public Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString(){
        return firstName + " " + lastName + '\n';
    }
}
