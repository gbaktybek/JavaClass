package class08;

import java.util.Scanner;

public class LadIfElseHwEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your mark");
        int mr = scan.nextInt();

        if(mr>100){
            System.out.println("Please enter valid mark (0-100)");
        }else if(mr>=90){
            System.out.println("A+");
        }else if(mr>=80){
            System.out.println("A");
        }else if(mr>=70){
            System.out.println("B+");
        }else if(mr>=60){
            System.out.println("B");
        }else if(mr>=50){
            System.out.println("C+");
        }else if(mr>=40){
            System.out.println("C");
        }else if(mr<40){
            System.out.println("Fail!");
        }else if(mr<0){
            System.out.println("Please, enter valid mark (0-100)");
        }
    }
}
