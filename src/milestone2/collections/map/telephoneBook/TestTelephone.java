package milestone2.collections.map.telephoneBook;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class TelephoneBook{
    HashMap<String,String> telephone = new HashMap<String,String>();
    void add(String name,String phoneNumber){
        telephone.put(name,phoneNumber);
    }
    void display(){
        for (Map.Entry<String,String> entry : telephone.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}


public class TestTelephone {
    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook();
        telephoneBook.add("Javed","123456789");
        telephoneBook.add("Ashok","789456123");
        telephoneBook.add("Shivam","456123789");
        telephoneBook.display();

    }
}
