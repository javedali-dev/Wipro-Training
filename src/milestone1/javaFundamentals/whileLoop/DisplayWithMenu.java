/* Write a program that displays a menu with options 1. Add 2. Sub
Based on the options chosen, read 2 numbers and perform the relevant operation. After performing the operation, the program should ask the user if he wants to continue. If the user presses y or Y, then the program should continue displaying the menu else the program should terminate.
[ Note: Use Scanner class, you can take help from the trainer regarding the same ]
 */


package milestone1.javaFundamentals.whileLoop;

import java.util.Scanner;

public class DisplayWithMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char choice;
        do{
            System.out.println("1.Add");
            System.out.println("2.Sub");
            int ch = scan.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter two number");
                    int a = scan.nextInt();
                    int b = scan.nextInt();
                    System.out.println("Addition of two value:" + (a + b));
                    break;
                case 2:
                    System.out.println("Enter two number");
                    int x = scan.nextInt();
                    int y = scan.nextInt();
                    System.out.println("Addition of two value:" + (x - y));
                    break;
                    default:
                        System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue(Y/N):");
           choice = scan.next().charAt(0);
        }while(choice =='Y'|| choice =='y');
    }
}
