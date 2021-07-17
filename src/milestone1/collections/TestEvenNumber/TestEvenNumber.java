package milestone1.collections.TestEvenNumber;

import java.util.ArrayList;

class EvenNumber{
    ArrayList<Integer> saveEvenNumber(int n){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 2; i <=n ; i++) {
            if(i%2==0){
                arr.add(i);
            }
        }
        return arr;
    }

    ArrayList<Integer> printEvenNumber(int n){
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        ArrayList<Integer> arr1 = saveEvenNumber(n);

        for (int i = 0; i < arr1.size() ; i++) {
            int a = arr1.get(i)*2;
            arr2.add(a);
            System.out.println(a+" ");
        }
        return arr2;
    }

    int printEvenNumber(int n,int num){
        ArrayList<Integer> arr = saveEvenNumber(n);
        for (int i = 0; i <arr.size() ; i++) {
            if(arr.get(i)==num){
                return num;
            }
        }
        return 0;
    }
}

public class TestEvenNumber {
    public static void main(String[] args) {
        EvenNumber evenNumber = new EvenNumber();
        //evenNumber.printEvenNumber(100);
        System.out.println(evenNumber.printEvenNumber(100,20));
    }
}
