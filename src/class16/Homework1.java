package class16;
//print sum of each digit of given number

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num= scan.nextInt();

        int sum=0;
        for(; num>0; num=num/10 ){
            int digit=num%10;
            sum= sum + digit;
        }
        System.out.println(sum);
    }
}
