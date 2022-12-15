package class15;

import java.util.Scanner;

public class Task4Reverse {
   // Write a program to print each digit of the number into a separate line in reverse order
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a number that has more than 1 digit");
       int num = sc.nextInt();

       for (; num>0; num=num/10){
           System.out.println(num%10);
       }
   }
}
