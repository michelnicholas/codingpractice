package logicproblems;

public class LogicCheckSquareAndCube {

//    Create a function that takes an array of two numbers and checks if the square root of the
//    first number is equal to the cube root of the second number.
//
//            Examples
//    checkSquareAndCube([4, 8]) ➞ true
//
//    checkSquareAndCube([16, 48]) ➞ false
//
//    checkSquareAndCube([9, 27]) ➞ true



    public boolean sqauresAndCubes(int[] arr){
       /*
       Using code math class finding square root of the first index of the array
       and comparing it to make sure that it equals the cube root of the second index of the array
       return the answer in boolean
        */

        return Math.sqrt(arr[0]) == Math.cbrt(arr[1]);
    }



}
