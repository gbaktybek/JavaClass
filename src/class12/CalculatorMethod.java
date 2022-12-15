package class12;

import java.util.Scanner;

public class CalculatorMethod {

    static void add( int a, int b ){
        System.out.println( a+b );
    }
    static void sub( int a, int b ){
        System.out.println( a-b );
    }
    static void mul( int a, int b ){
        System.out.println( a*b );
    }
    static void div( int a, int b ){
        System.out.println( a/b );
    }


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
                add( a,b );
                break;
            case 2:
                sub(a,b);
                break;
            case 3:
                mul(a,b);
                break;
            case 4:
                div(a,b);
                break;
            default:
                System.out.println("Choose operation from 1to 4!");
        }

    }
}
