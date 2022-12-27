package class10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 digit number");
        int num = scan.nextInt();

        if (num >= 100 && num <= 999) {
            int digit1=num%10, digit2=(num%100)/10, digit3=num/100;
            System.out.println("Here is the reverse of the number you entered:"+digit1+digit2+digit3);
        }else{
            System.out.println("Please enter valid 3 digit number(100-999)");
        }
    }
}
