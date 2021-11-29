package stringsproblems;

import org.testng.annotations.Test;

public class String1withoutX2 {
//    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
//    and otherwise return the string unchanged. This is a little harder than it looks.
//
//
//    withoutX2("xHi") → "Hi"
//    withoutX2("Hxi") → "Hi"
//    withoutX2("Hi") → "Hi"

    public String withoutX2(String str) {
        // get the length of the string
        // create empty string to store the new strings without x chars
        int length = str.length();
        String result = "";

        // use if statement to make sure string length is greater than O and check with
        // char.At if the index 0 is an not an x char to add the letter.
        if (length > 0 && str.charAt(0) != 'x') {
            result = "" + str.charAt(0);
        }
        // use if statement to make sure string length is greater than 1 and check with
        // char.At if the index 1 is an not an x char to add the letter with the current empty string from previous
        // if statement.
        if (length > 1 && str.charAt(1) != 'x') {
            result = result + str.charAt(1);
        }
        // only if the string is greater than two will you be able to con cat the string adding new string.
        if (length > 2) {
            return result + str.substring(2);
        }
    return result;

    }

    @Test
    public void example(){
        System.out.println(withoutX2("xxHello"));
    }
}



// start with new string
    // use for loop and scan each character with i to find the x
    // if statement should filter out whether the x is use charAt to find the first two
    // if one or both of the first 2 chars is x return the string without x chars
    // chars of the string and see if it is x
// return the  new string without the x ;



