package arrayproblems;

public class Array2more14 {
    public boolean more14(int[] nums){
        // made variables to count the number of times the number one and the number 4 appear
        // appears inside the array
        int number1count = 0;
        int number4count = 0;

        // created for loop to run iteration i to scan thr the array to
        // get the number of 1 and 4s
        for(int i = 0; i < nums.length;i++){
            // if statement to see how many times the number 1 appears inside the array
            if(nums[i] == 1){
                // counter ..  every time i equals to 1 use counter to add the number
                number1count++;
            }
            // if statement to see how many times the number 4 appears inside the array
            if(nums[i] == 4){
                // counter.. every time i equals to 1 use counter to add the number
                number4count++;
            }
        }
        // if statement to compare the number of 1s to number of 4s
        if (number1count > number4count){
            return true;
        }
        // return false if the number of 1s are not greater than the number of 4s
        return false;
    }

}