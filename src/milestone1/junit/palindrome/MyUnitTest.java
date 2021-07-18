package milestone1.junit.palindrome;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class MyUnit{
    String reverseString(String str){
        String[] arr = str.split("");
        String temp = "";
        for(int i=arr.length-1;i>=0;i--){
            temp+=arr[i];
        }
        return temp;
    }
    boolean palindromeCheck(String str){
        if(reverseString(str).equals(str)){
            return true;
        }
        else
            return false;
    }
}

public class MyUnitTest {
    @Test
    public void testPalindrome(){
        MyUnit myUnit = new MyUnit();
        assertTrue(myUnit.palindromeCheck("madam"));
    }

}
