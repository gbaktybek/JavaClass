package class43;

import java.util.*;

public class Homework2 {
    public static void main(String[] args) {
        Map<String, List<Integer>> studentMarks = new HashMap<>();

        List<Integer> marksOfAli = new ArrayList<>(Arrays.asList(94, 51, 34, 60, 23));
        List<Integer> marksOfChirag = new ArrayList<>(Arrays.asList(34, 45, 34, 43, 89));
        List<Integer> marksOfMaria = new ArrayList<>(Arrays.asList(93, 56, 24, 85, 23));
        List<Integer> marksOfAlina = new ArrayList<>(Arrays.asList(100, 65, 23, 62, 77));
        List<Integer> marksOfCharlie = new ArrayList<>(Arrays.asList(22, 50, 87, 60, 90));

        studentMarks.put("Ali", marksOfAli);
        studentMarks.put("Chirag", marksOfChirag);
        studentMarks.put("Maria", marksOfMaria);
        studentMarks.put("Alina", marksOfAlina);
        studentMarks.put("Charlie", marksOfCharlie);

        System.out.println(getStudentNameHavingGreatestTotal(studentMarks));
    }

    // Implement below method to find total greatest mark
    public static String getStudentNameHavingGreatestTotal(Map<String, List<Integer>> studentMarks) {
        String studentName = null;
        int greatestTotalMarks = 0;

        for (Map.Entry<String, List<Integer>> pair : studentMarks.entrySet()) {
            int sumOfMarks = 0;

            List<Integer> totalMarks = pair.getValue();
            for (int mark : totalMarks) {
                sumOfMarks=sumOfMarks+mark;
            }
            if (sumOfMarks > greatestTotalMarks) {
                greatestTotalMarks=sumOfMarks;
                studentName = pair.getKey();
            }
        }
        return studentName;
    }
}
