package class42;

import java.util.*;

public class SetPracticalEx {
    public static void main(String[] args) {
        List<String> listOfData = new ArrayList<>();

        listOfData.add("Apple");
        listOfData.add("Tomato");
        listOfData.add("Mango");
        listOfData.add("Banana");
        listOfData.add("Potato");
        listOfData.add("Banana");
        listOfData.add("Cucumber");
        listOfData.add("Apple");

        System.out.println(listOfData);

        System.out.println("Unique Items in the list");
        Set<String> uniqueItem = new HashSet<>();
        uniqueItem.addAll(listOfData);
        System.out.println(uniqueItem);

        //find duplicate items in the given list
        //uniqueItem.add("banana"); - return true if banana was not present, return false if it was
        System.out.println();

        Set<String> duplicateItems = new HashSet<>();
        for (String item : listOfData) {
            if (duplicateItems.add(item) == false) {
                System.out.println(item);
            }
        }


    }
}
