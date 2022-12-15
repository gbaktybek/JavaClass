package class06;

import java.util.Scanner;

public class Task2_PrincipleInterest {
    public static void main(String[] args) {
        Scanner sn= new Scanner(System.in);


        System.out.println("If you want to find out your interest, answer the question below:");
        System.out.println("How much is the principle?");
        double principle= sn.nextDouble();

        System.out.println("How much is the interest rate?" );
        double rate= sn.nextDouble();

        System.out.println("How many years you will be paying?");
        int time= sn.nextInt();

        double interest= principle*rate*time;

        System.out.println("Here is your interest:");
        System.out.println(interest);
    }
}
