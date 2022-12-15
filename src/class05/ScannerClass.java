package class05;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scan.nextInt(), b = scan.nextInt();

        int c = a+b;
        System.out.println("Here is the sum of two numbers "+c);


    }
}
