/* Write a program to initialize an integer array and print the sum and average of the array.
 */

package milestone1.javaFundamentals.OneDArray;

public class SumAndAverageOFArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9,10};
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum:"+sum);
        System.out.println("Average:"+sum/arr.length);
    }
}
