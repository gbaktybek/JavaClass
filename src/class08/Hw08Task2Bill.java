package class08;

import java.util.Scanner;

public class Hw08Task2Bill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the total amount of a customer?");
        double total = scan.nextDouble();

        if (total>=10000) {
            System.out.println(total - total*.2 +" final amount after 20% discount applied ");
        } else if (total>=5000) {
            System.out.println(total - total*.15 +" final amount after 15% discount applied ");
        } else if (total>=2000) {
            System.out.println(total - total*.1 +" final amount after 10% discount applied ");
        } else if (total>=1000) {
            System.out.println(total - total*.05 +" final amount after 5% discount applied ");
        }else{
            System.out.println("No discount applied!");
        }
    }
}
