package milestone1.july5;

import java.util.Scanner;

public class ConvertCharUpperToLowerCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if(Character.isUpperCase(ch))
            System.out.println(ch+" -> "+Character.toLowerCase(ch));
        else
            System.out.println(ch+" -> "+Character.toUpperCase(ch));
    }
}
