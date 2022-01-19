package logicproblems;

public class TeenNumberChecker {

//    We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
//    Write a method named hasTeen with 3 parameters of type int.
//    The method should return boolean and it needs to
//    return true if one of the parameters is in range 13(inclusive) - 19 (inclusive).
//    Otherwise return false.

//    EXAMPLES OF INPUT/OUTPUT:
//            * hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
//            * hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
//            * hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19

    public static boolean hasTeen(int teen1,int teen2,int teen3){
        if (teen1 >= 13 && teen1 <= 19  || teen2 >= 13 &&
                teen2 <= 19 || teen3 >= 13 && teen3 <= 19){
            return true;
        }
        return false;

    }

//    Write another method named isTeen with 1 parameter of type int.
//    The method should return boolean
//    return true if the parameter is in range 13(inclusive) - 19 (inclusive).
//    Otherwise return false.

//    EXAMPLES OF INPUT/OUTPUT:
//            * isTeen(9);  should return false since 9 is in not range 13 - 19
//            * isTeen(13);  should return true since 13 is in range 13 - 19

    public static boolean isTeen(int teen){
        if (teen >= 13 && teen <= 19){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("This number doesn't have teen = 12 " + isTeen(12));
        System.out.println("This number is a teen = 13 " + isTeen(13));
        System.out.println("These numbers do have a teen = 12,13,15 " + hasTeen(12,13,15));
        System.out.println("These numbers don't have a teen = 2,3,5 " + hasTeen(2,3,5));
    }


}
