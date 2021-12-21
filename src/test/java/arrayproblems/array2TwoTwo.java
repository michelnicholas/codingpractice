package arrayproblems;

public class array2TwoTwo {
//    Given an array of ints, return true if every 2 that appears in the array is next to another 2.
//
//
//    twoTwo([4, 2, 2, 3]) → true
//    twoTwo([2, 2, 4]) → true
//    twoTwo([2, 2, 4, 2]) → false

    public boolean twoTwo(int[] nums) {

        /*
        Use nested while loop inside of for loop to count the number of
        times when a 2 is counted t
        count the number of 2s
        it is not just once then we will return false
        **nested While loop is good for scanning inside of for loop for multiple conditions
        needed inside the method**
        */

        for(int i = 0; i < nums.length;i++){
            int numberOf2 = 0;
            while(i < nums.length && nums[i]== 2){
                numberOf2++;
                i++;
            }
            if(numberOf2 == 1){
                return false;
            }
        }
        return true;

    }



}
