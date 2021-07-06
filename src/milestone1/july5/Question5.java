package milestone1.july5;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number:");
        x = scan.nextInt();
        if(x%2==0)
            System.out.println("Given number is even");
        else
            System.out.println("Given number is odd");
    }
}
