package milestone1.exceptionHandling.mathOperations;


public class TestMathOperations {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for (int i = 0; i <args.length ; i++) {
            try{
                arr[i] = Integer.parseInt(args[i]);
            }catch(NumberFormatException e){
                System.out.println(e);
            }
        }
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        System.out.println("Sum:"+sum);
        try {
            System.out.println("Average:"+sum/arr.length);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
