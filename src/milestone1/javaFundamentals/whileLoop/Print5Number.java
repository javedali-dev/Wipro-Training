/*Write a program to print first 5 values which are divisible by 2, 3, and 5.
 */
package milestone1.javaFundamentals.whileLoop;

public class Print5Number {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while(count<5){
            if(i%2==0 && i%3==0 &&i%5==0){
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
    }
}
