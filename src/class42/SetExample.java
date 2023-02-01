package class42;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> setOfData = new HashSet<>();


        setOfData.add(10);
        setOfData.add(20);
        setOfData.add(30);
        setOfData.add(40);
        setOfData.add(10);
        setOfData.add(30);

        System.out.println(setOfData);
    }
}
