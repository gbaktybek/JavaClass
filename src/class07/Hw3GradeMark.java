package class07;

import java.util.Scanner;

public class Hw3GradeMark {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your mark");
        int mark = scan.nextInt();

        if(mark<=100 && mark>=90){
            System.out.println("You got A+");
        }else if (mark<=89 && mark>=80){
            System.out.println("You got A");
        }else if (mark<=79 && mark>=70){
            System.out.println("You got B+");
        }else if (mark<=69 && mark>=60){
            System.out.println("You got B");
        }else if (mark<=59 && mark>=50){
            System.out.println("You got C+");
        }else if (mark<=49 && mark>=40){
            System.out.println("You got C");
        }else if (mark<40){
            System.out.println("Fail!");
        }
    }
}
