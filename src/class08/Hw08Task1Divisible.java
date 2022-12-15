package class08;

import java.util.Scanner;

public class Hw08Task1Divisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers to know if they are divisible by 5 or not:");
        int a = scan.nextInt(), b = scan.nextInt();

         if(a%5==0){
             System.out.println(a + " is divisible by 5");
         }else{
             System.out.println(a + " is not divisible by 5");
         }

        if(b%5==0){
            System.out.println(b + " is divisible by 5");
        }else{
            System.out.println(b + " is not divisible by 5");
        }
    }
}
