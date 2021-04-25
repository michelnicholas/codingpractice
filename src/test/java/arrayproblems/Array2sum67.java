package arrayproblems;

public class Array2sum67 {
    public int sum67(int[] nums) {
        int sum = 0;
        boolean inZone = false;


        for(int i = 0; i < nums.length;i++){
            int each = nums[i];

            // found the 6, zone has started
            if(each == 6){
                inZone = true;
            }
            // not in the zone, just the do the sum
            if(inZone == false){
                sum += each;
            }

            // in the zone, and found 7 , mark the end of the zone
            if(each == 7){
                inZone = false;
            }
        }
        return sum;
    }

}
