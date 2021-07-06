/* Initialize a character variable in a program and
if the value is alphabet then print "Alphabet" if it’s a number then print "Digit"
and for other characters print "Special Character"
 */

package milestone1.july5;

import java.util.Scanner;

public class CheckCharAndPrintType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if(Character.isDigit(ch))
            System.out.println("Digit");
        else if(Character.isLetter(ch))
            System.out.println("Alphabet");
        else
            System.out.println("Special Character");
    }
}
