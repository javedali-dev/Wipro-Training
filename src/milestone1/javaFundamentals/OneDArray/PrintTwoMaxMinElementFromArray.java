package milestone1.javaFundamentals.OneDArray;

public class PrintTwoMaxMinElementFromArray {
    static void printTwoMax(int[] arr){
        int max =0;
        int secondMax = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
        }
        System.out.println("Max1:"+max+"  Max2:"+secondMax);

    }
    static void printTwoMin(int[] arr){
        int secondMin,min;
        min=secondMin=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                secondMin = min;
                min = arr[i];
            }else if( arr[i]<secondMin && arr[i]!=min)
                secondMin=arr[i];
        }
        System.out.println("Min1:"+min+"  Min2:"+secondMin);

    }


    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9};
        printTwoMax(arr);
        printTwoMin(arr);
    }
}
