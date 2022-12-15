package class07;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //get two number from user and print max number
        System.out.println("Enter two different numbers:");
        int num1 = scan.nextInt(), num2 = scan.nextInt();

        System.out.println("Here is the maximum number:");

        if(num1>num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
}
