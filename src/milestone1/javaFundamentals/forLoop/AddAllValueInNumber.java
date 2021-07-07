package milestone1.javaFundamentals.forLoop;

public class AddAllValueInNumber {
    static int addValue(int a){
        String[] arr = Integer.toString(a).split("");
        int sum=0;
        for(String i:arr){
            int x = Integer.parseInt(i);
            sum+=x;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println(addValue(num));
    }

}
