package class43;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfNames {
    public static void main(String[] args) {
        String names = "chirag maria gulnur ali " +
                "maryna max ali maria max " +
                "ali chirag yana maggie ali " +
                "yana maggie ali maryna max";

        String[] arrayOfNames = names.split(" ");

        Map<String, Integer> frequency = new HashMap<>();

        for (String name : arrayOfNames) {
            if (frequency.containsKey(name)) {
                frequency.put(name, frequency.get(name) + 1);
            } else {
                frequency.put(name, 1);
            }
        }

        System.out.println(frequency);

        String mostFrequentName = "";
        int maxCount = 0;
        for (Map.Entry<String,Integer> entry : frequency.entrySet())
        {
            String key = entry.getKey();
            Integer count = entry.getValue();
            if (count > maxCount)
            {
                maxCount = count;
                mostFrequentName = key;
            }
            // Condition for the tie.
            else if (count == maxCount){
                if (key.length() < mostFrequentName.length())
                    mostFrequentName = key;
            }
        }
        System.out.println("Most frequent name: "+ mostFrequentName);
        System.out.println("Count: "+ maxCount);
    }
}

