package arrayproblems;

public class Array2sum28 {
//    Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
//
//
//    sum28([2, 3, 2, 2, 4, 2]) → true
//    sum28([2, 3, 2, 2, 4, 2, 2]) → false
//    sum28([1, 2, 3, 4]) → false

    public boolean sum28(int[] nums){
        // returning true is all sums of the 2s is == 8 .. If > 8 or < 8 returning false
        int sum = 0;

        // run a loop to look for all the ints with the number 2
        for (int i = 0; i < nums.length;i++ ){
            // iteration to first see if the value is a 2
            if (nums[i] == 2){
                // after finding a 2 add it by two and concat to the sum
                sum += 2;
            }
        }
        // see if the sum of the values equal 8
        return sum == 8;
    }

}
