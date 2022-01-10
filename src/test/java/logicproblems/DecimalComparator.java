package logicproblems;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double input, double input2){
        int value = (int)(input * 1000);
        int value2 = (int)(input2 * 1000);


        if (value == value2){
            return true;
        }
        return false;

    }

}
