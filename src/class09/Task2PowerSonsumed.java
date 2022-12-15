package class09;

import java.util.Scanner;

public class Task2PowerSonsumed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter power consumed and the amount you need to pay will be printed");
        int power = scan.nextInt();

        if ( power<=600 || power>=0) {
            if ( power<=400){
                if (power<=200){
                    System.out.println( power*0.50 );
                }else{
                    System.out.println( 100 + ( power*0.65 ));
                }

            } else {
                System.out.println( 230 + ( power*0.80) );
            }
        } else {
            if ( power>600 ){
                System.out.println("Consumed power can't be higher than 600");
            } else {
                System.out.println("Invalid number entered!");
            }
        }
    }
}
