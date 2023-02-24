public class RankSwitchVersion {
    private double mark;

    // class constructor
    public RankSwitchVersion(double mark){this.mark = mark;}

    // accessor
    public String getRank(){
        switch ((int) mark / 10 - 5){ // casts to int, then integer divides by 10 and subtracts 5
            case 0,1: // if 50 <= mark < 70
                return "Below Expectations"; // automatically breaks using return statement
            case 2,3: // if 70 <= mark < 90
                return "Meets Expectations";
            case 4,5:  // if 90 <= mark <= 100
                // also works if mark is from 100 to 109, but lab did not ask for mark <=100
                return "Exceeds Expectations";
            default: // if mark < 50
                return "Unacceptable";
        }
    }
}
