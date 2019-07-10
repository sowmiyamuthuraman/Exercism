package main.java;

import java.util.Collections;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class RomanNumeral {

    String romanNumeral;
    public static final Map<Integer, String> romanNumeralConvertor = initMap();

    public static Map<Integer,String>initMap(){
        Map<Integer,String> map=new LinkedHashMap<Integer,String>();
        map.put(1000, "M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");
        return Collections.unmodifiableMap(map);
    }

    public RomanNumeral(int input) {
        romanNumeral = "";
        for (Map.Entry<Integer,String> romanNumeralEntry : romanNumeralConvertor.entrySet()) {
            int val = romanNumeralEntry.getKey();
            int quotient = input / val;
            input = input - (val * quotient);
            romanNumeral += String.join("", Collections.nCopies(quotient, romanNumeralEntry.getValue().toString()));
            if(input==0){
                break;
            }
        }

    }

   public String getRomanNumeral() {
        return romanNumeral;
    }
}