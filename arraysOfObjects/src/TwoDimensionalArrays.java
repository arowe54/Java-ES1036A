public class TwoDimensionalArrays {
    public static void main(String[] args){
        // 2D arrays hold matrices
        // multiple rows, each row with multiple columns
        // 2D = array of arrays

        // double array with 3 rows and 4 columnsS
        double[][] scores = new double[3][4];
        scores[2][1] = 95; // row 2, column 1 has value of 95


        // iterate through each element in the array
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.println(scores[row][col]);
            }
        }
    }
}
