/*Write a program to initialize an integer array with values and check if a given number is present in the array or not. If the number is not found, it will print -1 else it will print the index value of the given  number in the array
Ex1) Array elements are  {1,4,34,56,7} and the search element is 90
O/P: -1
Ex2)Array elements are  {1,4,34,56,7} and the search element is 56
O/P: 4
 */


package milestone1.javaFundamentals.OneDArray;

public class FindNumberInArray {
    static int findNumberInArray(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i])
                return i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={10,40,50,30,60,70,80,90};
        int num = Integer.parseInt(args[0]); //provide args = 40
        int a = findNumberInArray(arr,num);
        if(a==-1)
            System.out.println(num+" is not present");
        else
            System.out.println(num+" at location "+a);

    }
}
