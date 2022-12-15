package class12;

import java.util.Scanner;

public class MethodExample {

    // method name - doubleLine
    // return type - void
    // parameter - () - no param
    // method body - System.out.println("===========================================")
    static void doubleLine(){
        System.out.println("==============================================");
    }
    static void singleLine(){
        System.out.println("----------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        doubleLine();
        System.out.println("Welcome to the Calculator");
        doubleLine();
        singleLine();
        System.out.println("Please enter first number");
        singleLine();
        int num1 = scan.nextInt();
        singleLine();
        System.out.println("Please enter second number");
        singleLine();
        int num2 = scan.nextInt();
        doubleLine();
        System.out.println("Here is your addition: " + (num1+num2) );
        doubleLine();


    }

}
