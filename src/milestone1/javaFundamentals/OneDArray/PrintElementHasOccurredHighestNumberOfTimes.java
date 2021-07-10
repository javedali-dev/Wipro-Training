/* Write a program to print the element of an array that has occurred the highest number of times
Eg) Array -> 10,20,10,30,40,100,99
O/P:10
 */

package milestone1.javaFundamentals.OneDArray;

import java.util.Arrays;
import java.util.HashMap;

public class PrintElementHasOccurredHighestNumberOfTimes {
    static int mostFrequent(int arr[], int n)
    {

        // Sort the array
        Arrays.sort(arr);

        // find the max frequency using linear
        // traversal
        int max_count = 1, res = arr[0];
        int curr_count = 1;

        for (int i = 1; i < n; i++)
        {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }

        // If last element is most frequent
        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = arr[n - 1];
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {20,50,70,40,70};
        int n = arr.length;
        System.out.println(mostFrequent(arr,n));

    }
}
