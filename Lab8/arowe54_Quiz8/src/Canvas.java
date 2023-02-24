/*
Andrew Rowe
251276493
arowe54@uwo.ca
Quiz 8
Description:
Creates a canvas with a circle, rectangle and trapezoid, then prints their respective areas
 */
public class Canvas {
    public static void main(String[] args) {
        // Create an array of type Shape with three items
        Circle circle = new Circle(3);
        Rectangle rect = new Rectangle(5, 7);
        Trapezoid trap = new Trapezoid(9,7,5);
        Shape[] canvas = {circle, rect, trap};
        // Scan the array and print out each item
        for (int i = 0; i < canvas.length; i++) {
            System.out.println(canvas[i]);
        }
    }
}
/*
I am a circle shape of area: 28.27
I am a rectangle shape of area: 35.00
I am a trapezoid shape of area: 40.00
 */