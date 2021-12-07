package arrayproblems;

public class Array2fizzArray2 {

//    Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array.
//            Note: String.valueOf(xxx) will make the String form of most types. The syntax to make a new string array is: new String[desired_length]

//    fizzArray2(4) → ["0", "1", "2", "3"]
//    fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
//    fizzArray2(2) → ["0", "1"]

    public String[] fizzArray2(int n){

        // Take string array and create a new variable a with a new object String[n] to make int n be the amount of
        // numbers inside the array
        String[] a = new String[n];

        // create for loop to run thru n
        for(int i = 0 ; i < n ; i++){
            // using new variable a everytime i is less then the number n it will print that number using
            // string method valueof to print i into the new string array
            a[i] = String.valueOf(i);
            // another way to add i
            // a[i] = "" + i;
        }
        // return the new array
        return a;

    }
}
