
public class PersonDemo {
    public static void main(String[] args){
        Person me = new Person(); // me is an instance of the class Person, but also an object

        Person you = new Person("Mike", "Smith");

        Person LastName = new Person("smith");


        System.out.println(me.getFirstName());

        me.setFirstName("AK"); // sets the full name
        me.setLastName("Ouda");
        me.setYearOfBirth(2004);

        you.setFirstName("Jane");
        you.setLastName("Doe");

        you.setYearOfBirth(2005);

        // conditional statement
        if(me.getAge() > you.getAge()){
            System.out.println(me.getFirstName() + " is older than " + you.getFirstName() + " by " + (me.getAge() - you.getAge()) + " years.");
        } else if (me.getAge() < you.getAge()){
            System.out.println(me.getFirstName() + " is younger than " + you.getFirstName());
        } else {
            System.out.println(me.getFirstName() + " is the same age as " + you.getFirstName());
        }

        System.out.println("You are a " + you.getAgeStage() + " stage.");

        System.out.println(me.getFullName());
        System.out.println(me.getFirstName()+ "\n" + me.getLastName() + "\n" + me.getFullName());
    }
}