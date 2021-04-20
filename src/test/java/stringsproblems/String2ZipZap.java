package stringsproblems;

public class String2ZipZap {

    /*
    Problem:

    Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
    Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

    Examples:

    zipZap("zipXzap") → "zpXzp"

    zipZap("zopzop") → "zpzp"

    zipZap("zzzopzop") → "zzzpzp"
     */

    /*
    SOLVED *****
     */
    public String zipZap(String str) {
        String result = ""; // Return new string
        for (int i = 0; i < str.length(); i++) {

            if (i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {

                result += "zp";
                i += 2;
            } else {
                result += str.charAt(i);
            }
        }
        return result;

    }
}

