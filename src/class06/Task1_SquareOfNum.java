package class06;

import java.util.Scanner;

public class Task1_SquareOfNum {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //Task1
        System.out.println("Print a number here:");
        int num= scan.nextInt();

        int sqr = num*num;
        System.out.println("Here is the square of the number you've given:");
        System.out.println(sqr);



    }
}
