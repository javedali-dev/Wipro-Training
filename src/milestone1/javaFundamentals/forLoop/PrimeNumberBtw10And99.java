/*Write a program to check if a given number is prime or not
 */

package milestone1.javaFundamentals.forLoop;

import static milestone1.javaFundamentals.forLoop.GivenNumberPrimeOrNot.isPrime;

public class PrimeNumberBtw10And99 {
//    function to print prime number between lower and higher bound
    static void printPrimeNumber(int lower,int higher){
        for(int i = lower;i<=higher;i++){
            if(isPrime(i))
                System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        printPrimeNumber(10,99);
    }
}
