package stringsproblems;

import org.testng.annotations.Test;

public class String1left2 {


//    Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
//          left2("Hello") → "lloHe"
//          left2("java") → "vaja"
//          left2("Hi") → "Hi"

    public String left2(String str){
        if (str.length() < 2 ){
            return str;
        }
        else{
            String leftTwo = str.substring(0,2);
            String rest = str.substring(2);
            return rest + leftTwo;
        }
    }

    @Test
    public void example(){
        System.out.println(left2("happy"));
    }





}
