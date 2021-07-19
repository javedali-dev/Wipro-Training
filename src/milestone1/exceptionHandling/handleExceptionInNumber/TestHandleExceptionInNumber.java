package milestone1.exceptionHandling.handleExceptionInNumber;

import java.util.Scanner;

public class TestHandleExceptionInNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        try {
            int num = Integer.parseInt(a);
            System.out.println("Square of "+num+" is:"+num*num);
        }catch(NumberFormatException e){
            System.out.println("Entered input is not a valid format for an Integer.");
        }

    }
}
