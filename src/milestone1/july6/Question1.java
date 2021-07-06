/*Implement function which converts a string to an integer.*/

package milestone1.july6;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numberInString = scan.nextLine();
        int numberInInteger = Integer.parseInt(numberInString);
        System.out.println("Your String number converted to Integer:"+numberInInteger);
    }
}
