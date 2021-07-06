package milestone1.july5;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number:");
        x = scan.nextInt();
        if(x>0){
            System.out.println("Given number is positive");
        }
        else{
            System.out.println("Given number is odd");
        }
    }
}
