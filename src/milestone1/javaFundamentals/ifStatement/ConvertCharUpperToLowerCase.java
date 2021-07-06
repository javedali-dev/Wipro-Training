/*Write a program to convert from upper case to lower case and vice versa of an alphabet and
print the old character and new character as shown in example
(Ex: a->A, M->m).
 */


package milestone1.javaFundamentals.ifStatement;

import java.util.Scanner;

public class ConvertCharUpperToLowerCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if(Character.isUpperCase(ch))
            System.out.println(ch+" -> "+Character.toLowerCase(ch));
        else
            System.out.println(ch+" -> "+Character.toUpperCase(ch));
    }
}
