package class41;

import java.util.ArrayList;
import java.util.List;

// expected output - 10, 20 , 45, 50

public class ShortList {
    public static void main(String[] args) {
        List<Integer> listOfData = new ArrayList<>();

        listOfData.add(10);
        listOfData.add(50);
        listOfData.add(20);
        listOfData.add(45);

//        for (int data : listOfData) {
//            System.out.println(data);
//        }

        int min = listOfData.get(0);
        int minIndex = 0;
        for (int i = 0; i < listOfData.size()-1; i++) {
            min = listOfData.get(i);
            for (int j = i; j < listOfData.size()-1; j++) {
                if (listOfData.get(j) < min) {
                    min = listOfData.get(j);
                    minIndex=j;
                }
            }
            int temp = listOfData.get(i);
            listOfData.set(i, min);
            listOfData.set(minIndex, temp);

        }
        System.out.println(listOfData);
    }
}
