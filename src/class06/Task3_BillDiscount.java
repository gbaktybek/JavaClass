package class06;

import java.util.Scanner;

public class Task3_BillDiscount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your total amount?");
        double total = scan.nextDouble();
        System.out.println("How much discount did you get?");
        double discount = scan.nextDouble();

        double finalAmount = total - (total *discount/100);
        System.out.println("Here is your final amount:");
        System.out.println(finalAmount);
    }
}
