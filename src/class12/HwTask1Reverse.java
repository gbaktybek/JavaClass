package class12;

import java.util.Scanner;

public class HwTask1Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a 3 digit number to get its reverse");
        int a = scan.nextInt();

        int digit3 = a%10;
        int digit2 = (a%100)/10;
        int digit1 = a/100;

        System.out.print(digit3);
        System.out.print(digit2);
        System.out.print(digit1);
    }
}
