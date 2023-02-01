package class42;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> personAge = new HashMap<>();
        //Map<Key,Value> => the key cannot be duplicated, whereas values can

        personAge.put("Chirag", 29);
        personAge.put("Kris", 25);
        personAge.put("Maria", 18);
        personAge.put("Gulnur", 45);
        personAge.put("Chirag", 40);//override the age of Chirag


        //List of keys
        Set<String> setOfKeys = personAge.keySet();

        for (String key : setOfKeys) {
            System.out.println(key + "="+ personAge.get(key));
        }

        System.out.println();
        //Retrieving collections of pair
        Set<Map.Entry<String,Integer>> pairs=personAge.entrySet();

        for (Map.Entry<String, Integer> pair : pairs) {
            System.out.println(pair.getKey()+"="+ pair.getValue());
        }

    }

}
