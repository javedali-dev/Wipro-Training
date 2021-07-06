/* Write a program to print the color name, based on color code.
 If color code in not valid then print "Invalid Code".
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
 */

package milestone1.javaFundamentals.switchStatement;

import java.util.Scanner;

public class PrintColorNameFromColorCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        ch = Character.toUpperCase(ch);
        switch(ch){
            case 'R':
                System.out.println("R -> RED ");
                break;
            case 'B':
                System.out.println("B -> BLUE ");
                break;
            case 'G':
                System.out.println("G -> GREEN ");
                break;
            case 'O':
                System.out.println("O -> Orange ");
                break;
            case 'Y':
                System.out.println("Y -> YELLOW ");
                break;
            case 'W':
                System.out.println("W -> White ");
                break;
                default:
                    System.out.println("Invalid Code");
        }
    }
}
