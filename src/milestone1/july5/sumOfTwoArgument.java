/*Write a Program to accept two integers through the command line argument and print the sum of the two numbers
Example:
     C:\>java Sample 10 20
     O/P Expected : The sum of 10 and 20 is 30*/
package milestone1.july5;

public class sumOfTwoArgument {
    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        System.out.println("Sum of two command line argument is:"+(first+second));
    }
}
