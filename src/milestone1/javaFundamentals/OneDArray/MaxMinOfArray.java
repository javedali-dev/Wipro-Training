/*Write a program to initialize an integer array and find the maximum and minimum value of an array.
 */


package milestone1.javaFundamentals.OneDArray;

public class MaxMinOfArray {
    public static void main(String[] args) {
        int[] arr = {1,7,9,34,8,9,10,55,45,9,0};
       int  max = 0;
        for (int i = 0; i < arr.length; i++) {
           if(max<arr[i])
               max = arr[i];
        }
        System.out.println("Max:"+max);
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(min>arr[i])
                min=arr[i];
        }
        System.out.println("Min:"+min);
    }
}
