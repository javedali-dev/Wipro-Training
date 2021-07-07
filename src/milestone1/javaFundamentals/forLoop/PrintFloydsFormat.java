/* Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *

Example1:
     C:\>java Sample
     O/P Expected : Please enter an integer number

Example1:
     C:\>java Sample 3
     O/P Expected :
                   *
                   *  *
                   *  *  *
*/


package milestone1.javaFundamentals.forLoop;

public class PrintFloydsFormat {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if(num==0)
            System.out.println("Please Enter an Integer Number");
        for (int i = 0; i <num ; i++) {
            for(int j=0;j<=i;j++)
                System.out.print("*  ");
            System.out.println("\n");
        }
    }
}
