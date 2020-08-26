package ru.usetech.tests;

import java.util.HashMap;
import java.util.Map;

public class IteratorExampleMap {


    public static void main(String[] args) {


        HashMap<String, String> map = new HashMap<>();
        map.put("first", "Mama");
        map.put("second", "Myla");
        map.put("third", "Ramu");

/*
        //get iterator for array
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            //String text = iterator.next();
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println("Key = " + key + ", " + "Value = " + value + ";\n");
        }
*/
        for (Map.Entry<String, String> pair : map.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " : " + value);
        }
    }
}