package class09;

import java.util.Scanner;

public class Task3NotesAmount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give an amount to count total number of notes");
        int amount = scan.nextInt();

        int result;

        result=amount/500;
        if ( amount/500>=1){
            System.out.println( result + " Notes of 500");
        }

        amount=amount%500;
        result=amount/100;
        if ( amount/100>=1){
            System.out.println( result + " Notes of 100");
        }

        amount=amount%100;
        result=amount/20;
        if ( amount/20>=1){
            System.out.println( result + " Notes of 20");
        }

        amount=amount%20;
        result=amount/10;
        if ( amount/10>=1){
            System.out.println( result + " Notes of 10");
        }

        amount=amount%10;
        result=amount/5;
        if ( amount/5>=1){
            System.out.println( result + " Notes of 5");
        }

        amount=amount%5;
        result=amount/2;
        if ( amount/2>=1){
            System.out.println( result + " Notes of 2");
        }

        amount=amount%2;
        result=amount;
        if ( amount==1){
            System.out.println( result + " Notes of 1");
        }
    }
}
