/*Write a Java program to find if the given number is palindrome or not
Example1:
     C:\>java Sample 110011
     O/P Expected : 110011 is a palindrome

Example2:
     C:\>java Sample 1234
     O/P Expected : 1234 is not a palindrome
 */

package milestone1.javaFundamentals.whileLoop;

import java.sql.SQLOutput;

import static milestone1.javaFundamentals.forLoop.ReverseGivenNumber.reverseNumber;

public class CheckGivenNumberIsPalindrome {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if(num==reverseNumber(num)){
            System.out.println(num+" is a palindrome");
        }
        else
            System.out.println(num+" is not a palindrome");
    }
}
