package class07;

import java.util.Scanner;

public class IfElseDriverLicense {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scan.nextInt();

        if(age>16){
            System.out.println("You're eligible for driver's license");
        }else{
            System.out.println("You're not eligible for driver's license");
        }
    }
}
