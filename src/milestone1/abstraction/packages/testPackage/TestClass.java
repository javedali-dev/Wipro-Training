package milestone1.abstraction.packages.testPackage;

public class TestClass {
    public static void main(String[] args) {
        Foundation foundation = new Foundation();
//        foundation.var1 = 100;     Not accessible
        foundation.var2 = 200;
        foundation.var3 = 300;
        foundation.var4 = 400;
//        System.out.println(foundation.var1);   Not accessible
        System.out.println(foundation.var2);
        System.out.println(foundation.var3);
        System.out.println(foundation.var4);
    }
}
