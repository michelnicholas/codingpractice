package ap1;

import org.testng.annotations.Test;

public class scoresIncreasing {
    // In main repo


    public boolean scoresIncreasing(int[] scores){
        // start with for loop to introduce
        // scores.length-1 to make sure we close the paramaters of the array
        for(int i = 0; i < scores.length-1;i++){

            // create if statement filter to check to see if the number is greater than the next number
            // return false
            if(scores[i] > scores[i+1]){
                return false;
            }
        }
        // if all else fails we will return true
        return true;
    }

}
