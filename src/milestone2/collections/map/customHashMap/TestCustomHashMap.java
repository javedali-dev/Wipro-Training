package milestone2.collections.map.customHashMap;



import java.util.*;

class CustomHashMap{
    HashMap<String,String> chMap = new HashMap<String,String>();
    void add(String key,String value){
        chMap.put(key,value);
    }
   boolean checkKey(String key){
       for (Map.Entry<String,String> entry:chMap.entrySet()) {
           if(entry.getKey().equals(key)){
               return true;
           }
       }
       return false;

   }
    boolean checkValue(String value){
        for (Map.Entry<String,String> entry:chMap.entrySet()) {
            if(entry.getValue().equals(value)){
                return true;
            }
        }
        return false;

    }

    void displayHashMap(){
        for (Map.Entry<String,String> entry:chMap.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

}



public class TestCustomHashMap {
    public static void main(String[] args) {
        CustomHashMap customHashMap = new CustomHashMap();
       customHashMap.add("India","New delhi");
       customHashMap.add("Bangladesh","Dhaka");
       customHashMap.add("Azerbaijan","baku");
      customHashMap.displayHashMap();
    }
}
