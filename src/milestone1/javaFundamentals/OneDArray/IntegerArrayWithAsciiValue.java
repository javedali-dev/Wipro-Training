package milestone1.javaFundamentals.OneDArray;

public class IntegerArrayWithAsciiValue {
    public static void main(String[] args) {
        int[] arr = {97,98,99,100,101,102,103,104,105,106,107,108,109,110};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println((char)arr[i]);
        }
    }
}
