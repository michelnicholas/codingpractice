package arrayproblems;

public class Array2has22 {
//    Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
//
//            has22([1, 2, 2]) → true
//            has22([1, 2, 1, 2]) → false
//            has22([2, 1, 2]) → false
//
    public boolean has22(int[] nums){

        // run for loop for the array
        for(int i = 0; i < nums.length-1;i++){
            // once iteration number touches 2
            // and immediately after touches another to return true
            if (nums[i] == 2 && nums[i+1] == 2 ){
                //  return value must be boolean
                return true;
            }
        }
        //  return value must be boolean
        return false;
    }

}
