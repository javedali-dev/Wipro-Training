package milestone1.oopsAndInheritance.ClassesAndObjects;
class Calculator{
    static double powerInt(int num1,int num2){
        return Math.pow(num1,num2);
    }
    static double powerDouble(double num1,int num2){
        return Math.pow(num1,num2);
    }
}
public class CalculatePowerOfnum {
    public static void main(String[] args) {
        System.out.println("Calling PowerInt method:"+Calculator.powerInt(4,2));;
        System.out.println(("Calling PowerDouble method:"+Calculator.powerDouble(2.5,2)));
    }
}
