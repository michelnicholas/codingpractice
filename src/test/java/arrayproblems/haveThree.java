package arrayproblems;

public class haveThree {
//    Given an array of ints, return true if the value 3 appears in the array exactly 3 times,
//    and no 3's are next to each other.
//
//    haveThree([3, 1, 3, 1, 3]) → true
//    haveThree([3, 1, 3, 3]) → false
//    haveThree([3, 4, 3, 3, 4]) → false

    public boolean haveThree(int[] nums) {

        // variable to store 3s
        int threes = 0;
        //for loop to scan for 3s
        for(int i = 0; i < nums.length; i++){
            // once we find the number 3 we use counter to store in variable
            if(nums[i] == 3 ){
                threes++;
            }
        }
        // if threes has to many 3 we will return false and go to second for loop
        if(threes != 3){
            return false;
        }
        // at this for loop we are check to see if the number is a three next to the next three till the loop ends
        // and keep running
        for(int i= 0; i < nums.length-1;i++){
            if(nums[i] == 3 && nums[i+1] == 3){
                return false;
            }
        }
        // if all of these coditions are meet we will return false
        return true;
    }

/*
for loop
make a new int variable to count i
int result = 0
if iteration i sees a 3 you want to count it
if(nums[i] == 3 && nums[i-1] != 3 && nums[i+1] != 3){
  result++;
}
also we want to make sure that the 3 we count doesn't have another
three next to each other
when result == 3 we are going to return true if not we are going to return false
*/





}
