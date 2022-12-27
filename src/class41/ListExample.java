package class41;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> listOfData = new ArrayList<>();

        listOfData.add(10);
        listOfData.add(20);
        listOfData.add(30);
        listOfData.add(40);

        System.out.println(listOfData.size());
        System.out.println(listOfData);
        System.out.println(listOfData.get(0));

    }
}
