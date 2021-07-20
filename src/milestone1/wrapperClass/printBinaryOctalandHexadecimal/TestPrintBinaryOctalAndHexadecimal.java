package milestone1.wrapperClass.printBinaryOctalandHexadecimal;

public class TestPrintBinaryOctalAndHexadecimal {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        System.out.println("Given number:"+a);
        System.out.println("Binary Equivalent:"+Integer.toBinaryString(a));
        System.out.println("Octal Equivalent:"+Integer.toOctalString(a));
        System.out.println(("Hexadecimal Equivalent:"+Integer.toHexString(a)));
    }
}
