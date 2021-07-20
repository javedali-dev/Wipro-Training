package milestone1.wrapperClass.generateMaxMinValue;

public class TestMaxMinValue {
    static void printIntegerMaxMinValue(){
        System.out.println("Integer Range");
        System.out.println("Max:"+Integer.MAX_VALUE);
        System.out.println("Min:"+Integer.MIN_VALUE);
    }
    static void printDoubleMaxMinValue(){
        System.out.println("Double Range");
        System.out.println("Max:"+Double.MAX_VALUE);
        System.out.println("Min:"+Double.MIN_VALUE);
    }
    static void printLongMaxMinValue(){
        System.out.println("Long Range");
        System.out.println("Max:"+Long.MAX_VALUE);
        System.out.println("Min:"+Long.MIN_VALUE);
    }
    static void printShortMaxMinValue(){
        System.out.println("Short range");
        System.out.println("Max:"+Short.MAX_VALUE);
        System.out.println("Min:"+Short.MIN_VALUE);
    }
    static void printByteMaxMinValue(){
        System.out.println("Byte Range");
        System.out.println("Max:"+Byte.MAX_VALUE);
        System.out.println("Min:"+Byte.MIN_VALUE);
    }
    static void printFloatMaxMinValue(){
        System.out.println("Float Range");
        System.out.println("Max:"+Float.MAX_VALUE);
        System.out.println("Min:"+Float.MIN_VALUE);
    }

    public static void main(String[] args) {
        printIntegerMaxMinValue();
        printDoubleMaxMinValue();
        printLongMaxMinValue();
        printShortMaxMinValue();
        printByteMaxMinValue();
        printFloatMaxMinValue();
    }

}
