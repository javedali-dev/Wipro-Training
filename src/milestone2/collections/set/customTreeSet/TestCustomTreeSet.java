package milestone2.collections.set.customTreeSet;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

class CustomTreeSet{
    TreeSet<String> cts = new TreeSet<String>();
    void add(String element){
        cts.add(element);
    }
    NavigableSet<String> reverseTreeSet(TreeSet<String> normalTreeSet){
        return normalTreeSet.descendingSet();
    }
    void displayTreeSet(){
        Iterator<String> i = cts.iterator();
        while (i.hasNext()){
            System.out.println(i.next()+" ");
        }
    }
    Boolean checkElement(String str){
        for (String s :cts) {
            if(str.equals(s)){
                return true;
            }
        }
        return false;
    }
}



public class TestCustomTreeSet {
    public static void main(String[] args) {
        CustomTreeSet customTreeSet = new CustomTreeSet();
        customTreeSet.add("Wipro");
        customTreeSet.add("Amazon");
        customTreeSet.add("Google");
        customTreeSet.add("Facebook");
        customTreeSet.displayTreeSet();

    }
}
