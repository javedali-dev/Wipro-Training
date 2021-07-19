package milestone1.exceptionHandling.divisionOperation;

public class TestDivisionOperation {
    static void division(int a,int b) throws ArithmeticException{
        if(b==0)
            throw new ArithmeticException("b should not be Zero");
        else
            System.out.println("Division:"+a/b);
    }

    public static void main(String[] args) {
        division(1,0);
    }
}
