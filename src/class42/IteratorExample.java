package class42;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> listOfData = new ArrayList<>();

        listOfData.add(10);
        listOfData.add(20);
        listOfData.add(30);
        listOfData.add(40);

        Iterator<Integer> itr = listOfData.iterator();
        System.out.println(itr.next());
        System.out.println(itr.next());
        //or
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
