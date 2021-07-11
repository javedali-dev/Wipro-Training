/*Write a program to reverse a given number and print
Eg1)
I/P: 1234
O/P:4321
Eg2)
I/P:1004
O/P:4001
 */


package milestone1.javaFundamentals.whileLoop;

public class ReverseGivenNumber {
    public static int reverseNumber(int num){
        String[] arr = Integer.toString(num).split("");
        String temp = "";
        for(int i=arr.length-1;i>=0;i--){
            temp+=arr[i];
        }
        return Integer.parseInt(temp);
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println(reverseNumber(num));
    }
}
