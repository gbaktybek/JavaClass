package class06;

import java.util.Scanner;

public class AgeMonthDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scan.nextInt();

        int month = age*12, days = age*365, min = days*24*60;

        System.out.println("You are " + age + " years old" );
        System.out.println("You are " + month + " months old" );
        System.out.println("You are " + days + " days old" );
        System.out.println("You are " + min + " minutes old" );
    }

    public static class Task3_Bill_Discount {
        public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);

            System.out.println("What is your total bill amount?");
            double total= scan.nextDouble();

            System.out.println("How much is the discount?");
            double discount= scan.nextDouble();

            double finalBill= total - total*discount;
            System.out.println("Here is your total amount after discount:");
            System.out.println(finalBill);
        }
    }
}
