package class09;

import java.util.Scanner;

public class NestedIfElse2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scan.nextInt();

        System.out.println("What is your salary?");
        int salary = scan.nextInt();

        if ( age>=18 ) {
            if ( salary>=20000 ){
                System.out.println("You'll get a free credit card.");
            } else if ( salary>=5000 ) {
                System.out.println("You're eligible");
            } else {
                System.out.println("Sorry. you need to work hard to get credit card.");
            }
        } else {
            System.out.println("You're not eligible!");
        }
    }
}
