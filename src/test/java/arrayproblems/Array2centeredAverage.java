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
        int average = 0;

        // filter out the loop of the array to be greater that 3
        // we are going to need to run a loop to ignore the largest and smallest values in the array
        // most likely using math.min() and math.max() methods
        // if multiple copies of the smallest and largest value just ignore one copy


        // after loop is ran we will add up the values and use division to find the final average

    }

}
