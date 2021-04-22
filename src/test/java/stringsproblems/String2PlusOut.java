package stringsproblems;

public class String2PlusOut {
    /*
    Given a string and a non-empty word string, return a version of the original String where all chars have been
    replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.

    plusOut("12xy34", "xy") → "++xy++"
    plusOut("12xy34", "1") → "1+++++"
    plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
    */

    public String plusOut(String str, String word) {
        int len = word.length();
        int valid = str.length()-len;
        String result = "";

        for(int i = 0; i < str.length(); ){
            // are you xy, yes? good, lets extract the word
            // concat, and update index to next position
            if(i <= valid && str.substring(i,i+len).equals(word)){
                result += word;
                i = i + len;
                continue;
            }



            // else, just concat (+) and move to next char
            result += "+";
            i++;
        }
        return result;
    }

}
