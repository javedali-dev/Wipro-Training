package milestone2.collections.set.countrySet;

import java.util.HashSet;

class Country{
    HashSet<String> h1 = new HashSet<String>();

    HashSet<String> saveCountryName(String countryName){
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

public class TestCountry {
    public static void main(String[] args) {
        Country country = new Country();
        country.saveCountryName("India");
        country.saveCountryName("Pakistan");
        country.saveCountryName("Bhutan");
        System.out.println(country.getCountryName("Bhutan"));
        System.out.println(country.getCountryName("England"));
    }
}
