public class TestingPrintStatements {
    public static void main(String[] args) {
        double grossPay = 123456.789;
        System.out.printf("\nYour pay is %,.2f\n", grossPay); // prints Your pay is 123,456.79
        // rounds the 2nd digit after decimal up (because it is supposed to. If it was 4 or less it would round down.)
        // adds a comma in the thousands digit

        double grossLoss = 1234;
        System.out.printf("Your number is %,f. ", grossLoss); // prints Your number is 1,234 with a comma in the thousands
        // plus 6 digits after decimal because it is a float
        System.out.printf("Your number with no decimals is %,.0f", grossLoss);

        int num = 5;
        System.out.printf("\nThe number printed to three digits total is %03d\n", num);
        int num2 = 6789;
        System.out.printf("Number 2 to three digits is not possible. It can only add zeros in front of it if it were 4 " +
                "digits because the number %d has 3 digits. The number to 5 digits is %05d. asdflkdsjfkldsjflksdjfklsdjf" +
                "klsjdfl", num2, num2);
        double testSurfaceArea = 2 * 3.14159 * 3 * 9;
        System.out.printf("\nSurface area to 14 decimals? %f\n", testSurfaceArea);
        System.out.printf("Same number definitely 14 decimals %.14f\n",testSurfaceArea);
        System.out.printf("Plus same number with commas in the thousands column?: %,.14f\n", testSurfaceArea);

        System.out.printf( "1234567890\n%-10d\n\n", 10000 ); // %-10d prints 10 digits and aligns d to the left
        System.out.printf("12345678901234567890\n%-8d%8d\n", 123456, 100001); // should have 4 blank digits between d
        // because first is left aligned, second is right aligned, 8-6=2, 2+2 = 4
        // 5 blank digits after the number, next value (if there is a value before the \n) will be 5 digits later
        System.out.printf( "% d\n%+d\n", 1000000, 1000000 ); // the space between % d prints a space then d ( 10000...)

    }
}