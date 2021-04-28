package stringsproblems;

public class String2RepeatEnd {
    /*
    Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.


    repeatEnd("Hello", 3) → "llollollo"
    repeatEnd("Hello", 2) → "lolo"
    repeatEnd("Hello", 1) → "o"
     */

    public String repeatEnd(String str, int n) {


        String result = "";
        String end = str.substring(str.length()-n);

        for(int i = 0; i < end.length(); i++){
            result += end;
        }
        return result;
    }


    /*
    1. Get the last n characters of the string
    2. put it in a loop so it prints n amount
    3. return the new string
    */
}
