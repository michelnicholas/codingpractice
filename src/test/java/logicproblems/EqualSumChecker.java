package logicproblems;

public class EqualSumChecker {

//    The method should return boolean and it needs to return true if
//    the sum of the first
//    and second parameter is equal to
//    the third parameter.
//    Otherwise, return false.


    public  static boolean hasEqualSum(int num1 , int num2, int num3){
        if (num1 + num2 == num3){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(3,4,5));
        System.out.println(hasEqualSum(1,1,2));
    }

}
