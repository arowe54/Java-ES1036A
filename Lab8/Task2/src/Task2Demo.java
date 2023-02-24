/*
Andrew Rowe, 251276493, arowe54
ES1036A
Description:
Creates instances of Cat, Dog, and Duck and prints what they say to the console.
 */
public class Task2Demo {
    public static void main(String[] args){
        // creating instances of subclasses of animal
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();

        System.out.println("Cat says:");
        System.out.println(cat.say());

        System.out.println("Dog says:");
        System.out.println(dog.say());

        System.out.println("Duck says:");
        System.out.println(duck.say());
    }
}
