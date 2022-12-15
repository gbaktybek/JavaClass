package class09;

import java.util.Scanner;

public class LadderIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scan.nextInt();
        //1st approach
        System.out.println("How much do you weigh?");
        int weight = scan.nextInt();

        /*
        if ( age>=18 && weight>=50) {
            System.out.println("You're eligible for blood donation");
        } else if ( age<18 && weight>=50){
            System.out.println("You're too young to donate a blood.");
        } else if ( age>=18 && weight<50 ) {
            System.out.println("You're underweight. Please eat more and try again");
        } else{
            System.out.println("You're not eligible");
        }
         */

        //2nd approach
        if ( age>=18){
            if ( weight>=50 ){
                System.out.println("You're eligible for blood donation");
            }else{
                System.out.println("You're underweight. Please eat more and try again");
            }
        }else{//age<18
            if ( weight>=50){
                System.out.println("You're too young to donate a blood.");
            }else { //weight<50
                System.out.println("You're not eligible");
            }
        }
    }
}
