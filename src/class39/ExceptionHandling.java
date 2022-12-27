package class39;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter two numbers:");
        try {
            int num1 = sc.nextInt(), num2 = sc.nextInt();
            System.out.println(num1 / num2);
        } catch (InputMismatchException e) {
            System.out.println("Please, enter a number only");
        } catch (ArithmeticException e) {
            System.out.println("A number cannot be divided by zero");
        }

        System.out.println("Nice to see you!");

    }
}
