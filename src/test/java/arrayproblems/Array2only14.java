package arrayproblems;

public class Array2only14 {

    public boolean only14(int[] nums) {
//        Given an array of ints, return true if every element is a 1 or a 4.
//
//
//        only14([1, 4, 1, 4]) → true
//        only14([1, 4, 2, 4]) → false
//        only14([1, 1]) → true

        /*
        We will need to return boolean values either true of false
        Run a loop using iteration i inside loop to find whether all numbers are either 1 or 4
        If 1 or 4 is found return true
        other wise return false
         */

        // For loop
        for (int i = 0; i < nums.length; i++){
            // if the number is not a 1 or 4 return false
            if (nums[i] != 1 && nums[i]!= 4){
                return false;
            }
        }

        // if all numbers are 1 and 4 return true
        return true;
    }
}
