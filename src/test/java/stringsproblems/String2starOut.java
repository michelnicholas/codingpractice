package stringsproblems;

public class String2starOut {

//    Return a version of the given string, where for every star (*) in the string the star and the chars immediately to
//    its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
//
//
//    starOut("ab*cd") → "ad"
//    starOut("ab**cd") → "ad"
//    starOut("sm*eilly") → "silly"

    public String starOut(String str){
        /*
        Run for loop for thru the string and when iteratiion i touches a char character '*' it will then
        then delete chars left and right of it .
        i - 1 and i + 1
         */

        String result = "";
        int len = str.length();
        for (int i = 0; i < len ;i++){
            if (i == 0 && str.charAt(i) != '*'){
                result += str.charAt(i);
            }
            /*
            If condition statement checking to see
             */
            if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*'){
                result += str.charAt(i);
            }
            if (i>0 && str.charAt(i) == '*' && str.charAt(i-1) != '*'){
                result = result.substring(0,result.length()-1);
            }


        }
        return result;
    }


}
