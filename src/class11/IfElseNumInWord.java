package class11;

import java.util.Scanner;

public class IfElseNumInWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number between 0 and 5, and you'll be given this number in word");
        int word = scan.nextInt();

        if (word==0){
            System.out.println("Zero");
        } else if (word==1) {
            System.out.println("One");
        }else if (word==2) {
            System.out.println("Two");
        }else if (word==3) {
            System.out.println("Three");
        }else if (word==4) {
            System.out.println("Four");
        }else if (word==5) {
            System.out.println("Five");
        }else {
            System.out.println("Enter numbers 0-5 only");
        }
    }
}
