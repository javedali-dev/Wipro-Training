package milestone2.collections.map.countryMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class CountryMap {

    HashMap<String,String> M1 = new HashMap<String,String>();
    HashMap<String,String> saveCountryCapital(String countryName, String capital){
        M1.put(countryName,capital);
        return M1;
    }

    String getCapital(String countryName){
        return M1.get(countryName);
    }

    String getCountry(String capitalName){
        for (Map.Entry<String,String> entry :M1.entrySet()) {
            if (Objects.equals(capitalName, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
    HashMap<String,String> reverseHashMap(){
        HashMap<String,String> M2 = new HashMap<String,String>();
        for (Map.Entry<String,String> entry :M1.entrySet()) {
            M2.put(entry.getValue(),entry.getKey());
        }
        return M2;

    }

    ArrayList<String> convertHashMapToArrayList(){
        ArrayList<String> countries = new ArrayList<String>();

        for (Map.Entry<String,String> entry :M1.entrySet()) {
            countries.add(entry.getKey());
        }
        return countries;
    }


}

public class TestCountryMap {
    public static void main(String[] args) {
     CountryMap countryMap = new CountryMap();
     countryMap.saveCountryCapital("India","New Delhi");
     countryMap.saveCountryCapital("Bangladesh","Dhaka");
     countryMap.saveCountryCapital("Pakistan","Lahore");
     countryMap.saveCountryCapital("Azerbaijan","Baku");
     countryMap.saveCountryCapital("Australia","Canberra");

     System.out.println("Capital of India:"+countryMap.getCapital("India"));
     System.out.println("Country of New Delhi:"+countryMap.getCountry("New Delhi"));

    }
}
