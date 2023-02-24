public class operators {
    public static void main(String[] args){
        int x = 5;
        double y = 2.5;
        x = x+11;
        /* high -> low rank
        double 8
        float 8
        long
        int 4
        short
        byte 1 bit
         */
        // can go from low to high but not high to low
        x = (int) y; // cast operator

        short a;
        short b = 3;
        short c = 7;
//        a = b + c; doesn't work because short converts to int to add

        a = (short)(b+c);

        byte a = 127;// -128 to 127, all positive is unsigned
        byte b = 10;
        byte c = (byte)(a+b);
        System.out.println(a+b); // int 137
        System.out.println(c);

    }
}
