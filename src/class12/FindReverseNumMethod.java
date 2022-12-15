package class12;

import java.util.Scanner;

public class FindReverseNumMethod {

    static void reverse(int num){
        int digit3 = num%10;
        int digit2 = (num%100)/10;
        int digit1 = num/100;

        System.out.print(digit3);
        System.out.print(digit2);
        System.out.print(digit1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number between 100 and 999 to get its reverse");
        int num = scan.nextInt();

        reverse(num);
    }
}
