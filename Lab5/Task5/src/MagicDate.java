public class MagicDate {
    private int month, day, year; // declaring privately accessed variables

    // class constructor
    public MagicDate(int m, int d, int y){
        this.month = m;
        this.day = d;
        this.year = y;
    }

    public boolean isMagic(){
        if (year == month*day){ // if the last 2 digits of year is equal to the month multiplied by the day
            return true; // is magic
        } else{
            return false; // is not magic
        }
    }
}
