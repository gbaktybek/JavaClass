package class16;

import java.util.Scanner;

public class GreatestDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number to find its greatest digit");
        int num = scan.nextInt();

        int max=num%10;
        for (; num !=0; num=num/10){
            int lastDigit= num%10;
            if (max<lastDigit){
                max=lastDigit;
            }
        }
        System.out.println(max);
    }
}
