package class07;

import java.util.Scanner;

public class Hw1PosNegZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = scan.nextInt();

        if(a>0){
            System.out.println("Number is positive");
        }else if(a<0){
            System.out.println("Number is negative");
        }else{
            System.out.println("0 is not negative nor positive");
        }
    }
}
