package class41;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> listOfData = new ArrayList<>();

        List<Integer> dynamicList = new ArrayList<>();
        dynamicList.addAll(listOfData);

        listOfData.add(10);
        listOfData.add(20);
        listOfData.add(30);
        listOfData.add(40);

        System.out.println(listOfData.size());
        System.out.println(listOfData);
        System.out.println(listOfData.get(0 ));

        Object data[] = listOfData.toArray();

        for (Object obj : data) {
            System.out.println((int)obj + (int)obj);
        }

        System.out.println(listOfData.contains(20));

        listOfData.remove(new Integer(10)); // remove data 10
        listOfData.remove(2);// remove element at index 2

        System.out.println(listOfData);


    }
}
