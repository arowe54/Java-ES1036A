/*
Uses static methods to perform operations on arrays,
including getting the total of the values of each index in the array, the average of the values, the highest value,
and the array in the reverse.
 */
public class SequenceOperations {
    public static double getTotal(double[] nums){
        double sum = 0;
        for (int i = 0; i<nums.length; i++){ // iterates through the entire array in the paramater
            sum += nums[i]; // adds the value at the i'th index of nums to sum
        }
        return sum; // returns the sum of the numbers at each index in the array
    }
    public static double getAverage(double[] nums){
        return getTotal(nums)/nums.length; // average sum/nums.length
    }

    public static double getHighest(double[] nums){
        // highest value in the array
        double high = 0;
        for (int i = 0; i<nums.length; i++){ // checks each value in the array
            if (nums[i] > high){ // if the value at the current index is higher than the high
                high = nums[i]; // then the current number is the highest number
            }
        }
        return high; // returns the highest value
    }

    public static double[] getReverse(double[] nums){
        // return the given array in reverse
        double[] numsReversed = new double[nums.length]; // create new empty array of the same size as nums
        for (int i = nums.length; i>0; i--){ // starts at end of array and iterates backwards
            // the beginning of nums2 is the end of nums1
            numsReversed[nums.length-i] = nums[i-1]; // as nums2 increases, nums 1 decreases
        }
        return numsReversed;
    }
}
