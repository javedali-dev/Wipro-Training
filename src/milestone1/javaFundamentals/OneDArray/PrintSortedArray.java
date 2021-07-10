/*Write a program to initialize an array and print them in a sorted fashion
 */
package milestone1.javaFundamentals.OneDArray;
import java.util.Arrays;
public class PrintSortedArray {
    public static void main(String[] args) {
        int[] arr = {7,6,8,9,3,2,4,5};
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
