package milestone1.exceptionHandling.handleExceptionInArray;

import java.util.Scanner;

public class TestHandleExceptionInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of element in the array");
        int n = scanner.nextInt();
        System.out.println("Enter the element in array");
        int[] arr = new int[5];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the Index you want to access the element:");
        int index = scanner.nextInt();
        try {
            int a = arr[index];
            System.out.println("The array element at index "+index+" :"+a);
            System.out.println("The array element successfully in the array");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getClass());
        }
    }
}
