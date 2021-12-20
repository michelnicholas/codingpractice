package arrayproblems;

public class array2Modthree {

    public boolean modThree(int[] nums) {

        for(int i = 0; i < nums.length-2;i++){

            if(nums[i] % 2 == 0 && nums[i+1] % 2 == 0 && nums[i + 2] % 2 == 0){
                return true;
            }
            else if(nums[i] % 2 == 1 && nums[i+1] % 2 == 1 && nums[i + 2] % 2 == 1){
                return true;
            }
        }
        return false;
    }

// take numbers and put them thru a for loop
// inside the for loop we want to check to see if the next three numbers are all either even
// i % 2 == 0;  i+1 % 2 == 0; i + 2 % == 0 return true;
    // i % 2 == 1; i+1 % 2 == 1; i + 2 % == 1 return true;
// otherwise we will return false


}

