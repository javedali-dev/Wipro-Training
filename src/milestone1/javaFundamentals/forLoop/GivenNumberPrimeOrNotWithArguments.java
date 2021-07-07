/* Write a Java program to find if the given number is prime or not.

Example1:
     C:\>java Sample
     O/P Expected : Please enter an integer number

Example2:
     C:\>java Sample 1
     O/P Expected : 1 is neither prime nor composite

Example3:
     C:\>java Sample 0
     O/P Expected : 0 is neither prime nor composite

 Example4:
     C:\>java Sample 10
     O/P Expected : 10 is not a prime number

Example5:
     C:\>java Sample 7
     O/P Expected : 7 is a prime number
*/

package milestone1.javaFundamentals.forLoop;

import static milestone1.javaFundamentals.forLoop.GivenNumberPrimeOrNot.isPrime;

public class GivenNumberPrimeOrNotWithArguments {
    public static void main(String[] args) {
        if (args.length==0)
            System.out.println("Please Enter a Integer Number");
        if(Integer.parseInt(args[0])==0) {
            System.out.println("0 is neither Prime Nor Composite");
            return;
        }
        if(Integer.parseInt(args[0])==1) {
            System.out.println("1 is neither Prime Nor Composite");
            return;
        }
        if(!isPrime(Integer.parseInt(args[0]))){
            System.out.println(args[0]+" is not a Prime number");
            return;
        }
        if(isPrime(Integer.parseInt(args[0]))){
            System.out.println(args[0]+" is a Prime number");
            return;
        }
    }
}
