package class21;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str= scan.nextLine();

        System.out.println(str.replaceAll(" ",""));

    }
}
