package class11;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose your operation:");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        int operation = scan.nextInt();

        System.out.println("Give two numbers for operation");
        int a = scan.nextInt(), b = scan.nextInt();

        switch (operation){
            case 1:
                System.out.println( a+b );
                break;
            case 2:
                System.out.println( a-b );
                break;
            case 3:
                System.out.println( a*b );
                break;
            case 4:
                System.out.println( a/b );
                break;
            default:
                System.out.println("Choose operation from 1to 4!");
        }
    }
}
