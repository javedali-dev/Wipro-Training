/*Initialize two character variables in a program and display the characters in alphabetical order.
Eg1) if first character is s and second is e
O/P: e,s
Eg2) if first character is a and second is e
O/P:a,e
 */
package milestone1.july5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeTwoCharAlphabetically {
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
