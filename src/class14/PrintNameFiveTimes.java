package class14;

import java.util.Scanner;

public class PrintNameFiveTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.nextLine();

        System.out.println("How many times you want to print your name?");
        int a = scan.nextInt();

        int b=1;
        while ( b <= a){
            System.out.println( name );
            b++;
        }
    }
}
