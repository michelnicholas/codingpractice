package arrayproblems;

public class Array2centeredAverage {

//    Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
//    except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value,
//    ignore just one copy, and likewise for the largest value. Use int division to produce the final average.
//    You may assume that the array is length 3 or more.
//
//
//    centeredAverage([1, 2, 3, 4, 100]) → 3
//    centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
//    centeredAverage([-10, -4, -2, -4, -2, 0]) → -3

    public int centeredAverage(int nums[]){
        // we are going to need an empty value to record the centered average
        // find the max number and smallest number
        int sum = 0;
        int max = nums[0];
        int min = nums[0];

        // filter out the loop of the array to be greater that 3
        // we are going to need to run a loop to ignore the largest and smallest values in the array
        for(int i = 0; i < nums.length-1;i++){
            // most likely using math.min() and math.max() methods
            // if multiple copies of the smallest and largest value just ignore one copy
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
            sum += nums[i];

            }
            // after loop is ran we will add up the values and use division to find the final average
            sum = sum - min - max;
        return sum / (nums.length-2);

    }



    }


