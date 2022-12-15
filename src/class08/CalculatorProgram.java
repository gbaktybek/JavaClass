package class08;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number");
        double n1= scan.nextInt();

        System.out.println("Enter the second number");
        double n2= scan.nextInt();

        System.out.println("Choose your operation:");
        System.out.println("Addition (enter 1)");
        System.out.println("Subtraction (enter 2)");
        System.out.println("Multiplication (enter 3)");
        System.out.println("Division (enter 4)");
        double operation = scan.nextInt();

        if (operation==1) {
            System.out.println(n1+n2);
        }else if (operation==2) {
            System.out.println(n1-n2);
        } else if (operation==3) {
            System.out.println(n1*n2);
        } else if (operation==4) {
            System.out.println(n1/n2);
        }


    }
}
