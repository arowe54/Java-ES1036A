public class Rank {
    private final double mark; // declares a privately accessed double named mark

    // class constructor
    public Rank(double mark){
        this.mark = mark;
    }

    public String getRank(){ // returns the interpretation of the mark to the user's console
        if (mark < 50){
            return "Unacceptable";
        } else if (mark < 70){ // 50 <= mark < 70
            return "Below Expectations";
        } else if (mark < 90){ // 70 <= mark < 90
            return "Meets Expectations";
        } else { // mark >= 90; does not check to see if less than or equal to 100, but was not told to do that anyways
            return "Exceeds Expectations";
        }
    }
}
