package milestone2.collections.set.countryTreeSet;

import java.util.HashSet;
import java.util.TreeSet;

class Country{
    TreeSet<String> h1 = new TreeSet<String>();

    TreeSet<String> saveCountryName(String countryName){
        h1.add(countryName);
        return h1;
    }

    String getCountryName(String countryName){
        for (String s: h1) {
            if(s.equals(countryName))
                return s;
        }
        return null;

    }
}
public class TestCountryTreeSet {
    public static void main(String[] args) {
        Country country = new Country();
        country.saveCountryName("Pakistan");
        country.saveCountryName("Bhutan");
        country.saveCountryName("India");

        System.out.println(country.getCountryName("India"));
        System.out.println(country.getCountryName("South Africa"));
    }
}
