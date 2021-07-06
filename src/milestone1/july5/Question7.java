package milestone1.july5;

import java.util.Arrays;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       char[] arr = new char[2];
        for( int i=0;i<2;i++){
           arr[i] = scanner.next().charAt(0);
       }
        Arrays.sort(arr);
        for(char a: arr)
            System.out.print(a+" ");

    }
}
