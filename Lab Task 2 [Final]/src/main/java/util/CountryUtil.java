package util;

import entity.Country;

import java.util.ArrayList;
import java.util.List;

public class CountryUtil {
    List<Country> countries = new ArrayList<>();
    public CountryUtil() {
        countries.add(new Country("BD", "Bangladesh"));
        countries.add(new Country("USA", "United States of America"));
        countries.add(new Country("CAD", "Canada"));
    }
    public List<Country> getAll() {
        return countries;
    }

    public Country getCountry(String id){
        for (Country country: countries) {
            if(country.getId().equals(id))
                return country;
        }
        return null;
    }
}
