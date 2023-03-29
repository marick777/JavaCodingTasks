package week11;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class frequencyOfChar {

    public static Map<Character, Integer> frequencyOfChar(String str){

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            //System.out.println(each+ " : "+frequency);

            map.put(each.charAt(0), frequency);
        }

        return map;
    }


    public static void main(String[] args) {
        System.out.println(frequencyOfChar("aaaabbbbbbbbcccccdddddddddAAABBCCDDDD@@@@@@@+++++!!!!!"));
    }
}

/*
Map-- Frequency of Characters
Write a method that prints the frequency of each character from a String.
 */
