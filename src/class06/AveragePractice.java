package class06;

import java.util.Scanner;

public class AveragePractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a=scan.nextInt(), b= scan.nextInt(), c= scan.nextInt();

        double d=(a+b+c)/3;

        System.out.println(d);
    }
}
