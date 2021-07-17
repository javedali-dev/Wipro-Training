package milestone1.collections.printAll;

import java.util.ArrayList;

public class TestPrintAll {
    static void printAll(ArrayList<String> arrayOfString) {
        for(String str:arrayOfString){
            System.out.println(str+" ");
        }
    }
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("Python");
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Php");
        languages.add("Go");
        printAll(languages);

    }
}
