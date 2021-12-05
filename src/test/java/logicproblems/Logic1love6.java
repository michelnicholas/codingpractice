package logicproblems;

public class Logic1love6 {
//    The number 6 is a truly great number. Given two int values, a and b,
//    return true if either one is 6. Or if their sum or difference is 6.
//    Note: the function Math.abs(num) computes the absolute value of a number.
//
//
//    love6(6, 4) → true
//    love6(4, 5) → false
//    love6(1, 5) → true


    public boolean love6(int a, int b){
       // in an if statement check to make sure if either a or b is equal to 6
        // also check to see if both numbers added equal to 6
        // check to see if both numbers substracted by each other equal to six use Math.abs to make sure all numbers
        // are whole and not negative.

        if (a + b == 6 || a - b == Math.abs(6) || b - a == Math.abs(6) || a == 6 || b == 6){
            return true;
        }
        return false;
    }



}
