/*Write a program to check if a given number is prime or not*/

package milestone1.javaFundamentals.forLoop;

public class GivenNumberPrimeOrNot {
    static boolean isPrime(int num){
        if(num<=1)
            return false;
        else if(num==2)
            return true;
        else if(num%2==0)
            return false;
        for (int i = 3; i <=Math.sqrt(num) ; i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 12;
        System.out.println(isPrime(num));
    }

}
